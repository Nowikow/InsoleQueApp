package com.example.insoleque

import android.os.Bundle
import android.widget.Button

import com.example.insoleque.utils.ButtonPressEffect
import com.example.insoleque.utils.UIHider

class ResultScreenActivity : UIHider() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        val okButton=findViewById<Button>(R.id.ok_button)
        ButtonPressEffect.apply(okButton)
    }
}