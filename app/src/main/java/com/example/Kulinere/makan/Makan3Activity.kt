package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_makan3.*

class Makan3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makan3)
        btn_back3.setOnClickListener {
            intent = Intent(this, MakanActivity::class.java)
            startActivity(intent)
        }
        map3.setOnClickListener {
            intent = Intent(this, MapsActivity3::class.java)
            startActivity(intent)
        }
    }
}
