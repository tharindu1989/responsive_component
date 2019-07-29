package com.test.responsive.component

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.test.responsive.R
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

        testViewOne.apply {
            height = ScreenUtil.height / 2
        }

        Log.e("HEIGHT", "Y = ${ScreenUtil.height}, X = ${ScreenUtil.width}")
    }
}