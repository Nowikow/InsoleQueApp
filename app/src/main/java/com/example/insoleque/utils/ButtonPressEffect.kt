package com.example.insoleque.utils

import android.annotation.SuppressLint
import android.view.View
import android.view.MotionEvent
import android.view.animation.ScaleAnimation

object ButtonPressEffect {
    @SuppressLint("ClickableViewAccessibility")
    fun apply(button: View) {
        val scaleDown = ScaleAnimation(
            1.0f, 0.9f, 1.0f, 0.9f,
            ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
            ScaleAnimation.RELATIVE_TO_SELF, 0.5f
        ).apply {
            duration = 100
            fillAfter = true
        }

        val scaleUp = ScaleAnimation(
            0.9f, 1.0f, 0.9f, 1.0f,
            ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
            ScaleAnimation.RELATIVE_TO_SELF, 0.5f
        ).apply {
            duration = 100
            fillAfter = true
        }

        button.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> v.startAnimation(scaleDown)
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> v.startAnimation(scaleUp)
            }
            false
        }
    }
}