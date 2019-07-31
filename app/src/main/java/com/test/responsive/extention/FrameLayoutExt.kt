package com.test.responsive.extention

import android.widget.FrameLayout
import com.test.responsive.util.ScreenUtil

/**
 * Created By Tharindu on 7/31/2019
 *
 */

/**
 * @param weight : weight of the screen by 100
 */
fun FrameLayout.setVerticalWeight(weight: Int) {

    val screenHeight = ScreenUtil.height
    this.layoutParams.apply {
        height = (screenHeight / 100) * weight
    }
}

/**
 * @param weight : weight of the screen by 100
 */
fun FrameLayout.setHorizontalWeight(weight: Int) {

    val screenHeight = ScreenUtil.width
    this.layoutParams.apply {
        width = (screenHeight / 100) * weight
    }
}