package com.example.insoleque

import android.os.Bundle
import android.widget.Button

import com.example.insoleque.utils.ButtonPressEffect
import com.example.insoleque.utils.UIHider

class MainActivity : UIHider() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createButton = findViewById<Button>(R.id.main_create_button)
        ButtonPressEffect.apply(createButton)
        val editButton = findViewById<Button>(R.id.main_edit_button)
        ButtonPressEffect.apply(editButton)

    }
}
