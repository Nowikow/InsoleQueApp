package com.example.insoleque

import android.os.Bundle
import android.widget.Button
import com.example.insoleque.utils.ButtonPressEffect

import com.example.insoleque.utils.UIHider

class RegActivity : UIHider() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        val regButton=findViewById<Button>(R.id.reg_button)
        ButtonPressEffect.apply(regButton)
    }
}