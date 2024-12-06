package com.example.insoleque

import android.os.Bundle
import android.widget.Button

import com.example.insoleque.utils.ButtonPressEffect
import com.example.insoleque.utils.UIHider

class PatientListActivity : UIHider() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_list)

        val backButton=findViewById<Button>(R.id.back_button)
        ButtonPressEffect.apply(backButton)
    }
}