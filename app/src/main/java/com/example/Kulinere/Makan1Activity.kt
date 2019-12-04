package com.example.Kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_makan1.*

class Makan1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makan1)
        btn_back1.setOnClickListener {
            intent = Intent(this, MakanActivity::class.java)
            startActivity(intent)
        }
        map1.setOnClickListener {
            intent = Intent(this, MapsActivity1::class.java)
            startActivity(intent)
        }
    }
}
