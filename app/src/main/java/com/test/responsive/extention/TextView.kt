package com.test.responsive.extention

import android.widget.TextView
import com.test.responsive.util.ScreenUtil

/**
 * Created By Tharindu on 7/29/2019
 *
 */
fun TextView.setVertialWeight(weight: Int) {
    val screenHeight = ScreenUtil.height
    this.apply {
        height = (screenHeight / 100) * weight
        width = ScreenUtil.width
    }
}

/**
 * set Text Font size by Weight
 * @param weight : weight by 100 of the height
 */
fun TextView.setTextFont(weight: Int) {
    val screenHeight = ScreenUtil.height.toFloat()
    val fontSize: Float = (screenHeight / 100) * weight
    this.apply {
        textSize = fontSize
    }
}