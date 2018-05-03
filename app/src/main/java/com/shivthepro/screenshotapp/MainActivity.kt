package com.shivthepro.screenshotapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val screenShotBtn =  findViewById<Button>(R.id.screeenshot_btn)
        screenShotBtn.setOnClickListener({
            // Here im passing the rootview of the button but you can also pass a view to do it.
            val bitmap = Util().takeScreenShot(it.rootView)
            val screenShotIV = findViewById<ImageView>(R.id.screenshot_iv)
            screenShotIV.setImageBitmap(bitmap)
        })
    }

}
