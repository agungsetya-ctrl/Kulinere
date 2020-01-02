package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_minum1.*
import kotlinx.android.synthetic.main.activity_minum3.*

class Minum3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minum3)
        back3.setOnClickListener {
            intent = Intent(this, MinumActivity::class.java)
            startActivity(intent)
        }
        peta3.setOnClickListener {
            intent = Intent(this, MapsActivitym3::class.java)
            startActivity(intent)
        }
    }
}
