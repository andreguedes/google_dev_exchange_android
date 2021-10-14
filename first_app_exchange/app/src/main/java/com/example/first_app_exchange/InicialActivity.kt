package com.example.first_app_exchange

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicial.*

class InicialActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)

        btnShowSecondScreen.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }
    }

}