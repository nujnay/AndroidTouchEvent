package com.nujnay.androidtouchevent

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class ChildView @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0) :
    View(context, attributeSet, defStyleAttr) {
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("TouchEvent::", "ChildView:onTouchEvent")
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        Log.d("TouchEvent::", "ChildView:dispatchTouchEvent")
        return super.dispatchTouchEvent(event)
    }
}