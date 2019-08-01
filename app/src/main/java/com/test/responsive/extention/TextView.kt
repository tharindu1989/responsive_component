package com.test.responsive.extention

import android.util.Log
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.marginTop
import com.test.responsive.util.ScreenUtil

/**
 * Created By Tharindu on 7/29/2019
 *
 */
fun TextView.setVerticalWeight(weight: Int) {
    val screenHeight = ScreenUtil.height
    this.layoutParams.apply {
        width = ViewGroup.LayoutParams.WRAP_CONTENT
        height = (screenHeight / 100) * weight
    }
}

/**
 * set Text Font size by Weight
 * @param weight : weight by 100 of the height
 */
fun TextView.setTextFontTEst(weight: Int) {
    val screenHeight = ScreenUtil.height.toFloat()
    val fontSize: Float = (screenHeight / 100) * weight
    //Log.e("FONT", "$fontSize")
    //Log.e("FONT", "${this.lineHeight}")
   // Log.e("FONT", "${fontSize / resources.displayMetrics.density}")
    this.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize / resources.displayMetrics.density)
   // this.setSingleLine(true)
   // this.includeFontPadding = false

}