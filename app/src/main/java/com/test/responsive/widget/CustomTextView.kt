package com.test.responsive.widget

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import com.test.responsive.util.ScreenUtil
import android.R.attr.left
import android.R.attr.right
import android.graphics.Paint
import android.graphics.Rect
import android.R.attr.bottom
import android.R.attr.top
import android.R.attr.left
import androidx.annotation.NonNull
import android.R.attr.top




/**
 * Created By Tharindu on 8/1/2019
 *
 */
class CustomTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    TextView(context, attrs, defStyleAttr) {

    private val mPaint = Paint()

    private val mBounds = Rect()

    var mAdditionalPadding: Int = 0

    init {
        includeFontPadding = false
    }

    override fun onDraw(canvas: Canvas) {
        val text = calculateTextParams()

        val left = mBounds.left
        val bottom = mBounds.bottom
        mBounds.offset(-mBounds.left, -mBounds.top)
        mPaint.isAntiAlias = true
        mPaint.color = currentTextColor
        canvas.drawText(text, (-left).toFloat(), (mBounds.bottom - bottom).toFloat(), mPaint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        calculateTextParams()
        setMeasuredDimension(mBounds.width() + 1, -mBounds.top + 1)
    }


    private fun measureHeight(text: String, measureWidth: Int): Int {
        val textView = TextView(context)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)
        textView.text = text
        textView.measure(measureWidth, 0)
        return textView.measuredHeight
    }

    private fun getAdditionalPadding(): Int {

        val textView = TextView(context)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)
        textView.setLines(1)
        textView.measure(0, 0)

        val measureHeight = textView.measuredHeight
        if (measureHeight > textSize)
            mAdditionalPadding = (measureHeight - textSize).toInt()

        Log.e("LOG", "Padding $mAdditionalPadding measure height : $measureHeight")
        return mAdditionalPadding
    }

    private fun calculateTextParams(): String {
        val text = text.toString()
        val textLength = text.length
        mPaint.setTextSize(textSize)
        mPaint.getTextBounds(text, 0, textLength, mBounds)
        if (textLength == 0) {
            mBounds.right = mBounds.left
        }
        return text
    }

    fun setTextFont(weight: Int) {
        val screenHeight = ScreenUtil.height.toFloat()
        val fontSize: Float = (screenHeight / 100) * weight
        //Log.e("FONT", "$fontSize")
        //Log.e("FONT", "${this.lineHeight}")
        // Log.e("FONT", "${fontSize / resources.displayMetrics.density}")
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize / resources.displayMetrics.density)
        // this.setSingleLine(true)
        // this.includeFontPadding = false

    }

    override fun setText(text: CharSequence?, type: BufferType?) {

        super.setText(text, type)
    }
}