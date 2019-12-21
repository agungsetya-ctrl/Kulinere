package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_makan1.*
import kotlinx.android.synthetic.main.activity_minum1.*

class Minum1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minum1)
        back1.setOnClickListener {
            intent = Intent(this, MinumActivity::class.java)
            startActivity(intent)
        }
        peta1.setOnClickListener {
            intent = Intent(this, MapsActivitym1::class.java)
            startActivity(intent)
        }
    }
}
