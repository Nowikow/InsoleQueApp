package com.example.insoleque

import android.os.Bundle
import android.widget.Button

import com.example.insoleque.utils.UIHider
import com.example.insoleque.utils.ButtonPressEffect

class QuestionActivity : UIHider() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val saveButton=findViewById<Button>(R.id.question_save_button)
        ButtonPressEffect.apply(saveButton)

        val buttons: List<Button> = listOf(
            findViewById(R.id.jalobi_button),
            findViewById(R.id.last_travmi_button),
            findViewById(R.id.lekar_sr_button),
            findViewById(R.id.ampl_poyas_button),
            findViewById(R.id.ampl_taz_button),
            findViewById(R.id.ampl_kol_button),
            findViewById(R.id.ampl_gol_button),
            findViewById(R.id.func_test_button),
            findViewById(R.id.mrt_button)
        )

        //функция перекликивания меню
        fun setupMenuButtons() {
            buttons.forEach { button ->

                ButtonPressEffect.apply(button)

                button.setOnClickListener {
                    if (!it.isEnabled) {
                        // Кнопка уже заблокирована, ничего не делаем
                        return@setOnClickListener
                    }

                    // Заблокировать нажатую кнопку
                    button.isEnabled = false
                    button.setBackgroundColor(0xFFFFC107.toInt())

                    // Разблокировать остальные кнопки
                    buttons.filter { it != button }.forEach {
                        it.isEnabled = true
                        it.setBackgroundColor(0xFFF44336.toInt())
                    }
                }
            }
        }

        setupMenuButtons()
    }
}