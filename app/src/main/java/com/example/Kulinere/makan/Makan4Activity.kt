package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_makan4.*

class Makan4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makan4)
        btn_back4.setOnClickListener {
            intent = Intent(this, MakanActivity::class.java)
            startActivity(intent)
        }
        map4.setOnClickListener {
            intent = Intent(this, MapsActivity4::class.java)
            startActivity(intent)
        }
    }
}
