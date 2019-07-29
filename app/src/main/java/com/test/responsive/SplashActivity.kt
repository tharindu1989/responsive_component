package com.test.responsive

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.test.responsive.util.ScreenUtil

import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        ScreenUtil.height = displayMetrics.heightPixels
        ScreenUtil.width = displayMetrics.widthPixels

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}
