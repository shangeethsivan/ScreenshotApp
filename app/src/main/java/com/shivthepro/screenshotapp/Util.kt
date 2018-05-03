package com.shivthepro.screenshotapp

import android.graphics.Bitmap
import android.view.View
class Util {
    fun takeScreenShot(view: View): Bitmap {
        view.isDrawingCacheEnabled = true
        view.buildDrawingCache()
        val bitmap= Bitmap.createBitmap(view.getDrawingCache())
        view.isDrawingCacheEnabled = false
        return bitmap
    }
}