package com.test.responsive.component

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.test.responsive.R
import com.test.responsive.extention.setHorizontalWeight
import com.test.responsive.extention.setVerticalWeight
import com.test.responsive.util.ScreenUtil
import kotlinx.android.synthetic.main.layout_component_one.view.*

/**
 * Created By Tharindu on 7/29/2019
 *
 */
class ComponentOne @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_component_one, this, true)

        wrapperView.setVerticalWeight(10)
        wrapperView.setHorizontalWeight(80)
        testViewOne.setTextFont(5)
        testViewTwo.setTextFont(5)
      //  testViewOne.setPadding(0,0,0,0)

        //testViewOne.setTextFont(1)

        Log.e("HEIGHT", "Y = ${ScreenUtil.height}, X = ${ScreenUtil.width}")
    }
}