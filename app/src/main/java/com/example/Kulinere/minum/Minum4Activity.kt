package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_minum1.*
import kotlinx.android.synthetic.main.activity_minum4.*

class Minum4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minum4)
        back4.setOnClickListener {
            intent = Intent(this, MinumActivity::class.java)
            startActivity(intent)
        }
        peta4.setOnClickListener {
            intent = Intent(this, MapsActivitym4::class.java)
            startActivity(intent)
        }
    }
}
