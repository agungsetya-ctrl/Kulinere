package com.example.Kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_makan5.*

class Makan5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makan5)
        btn_back5.setOnClickListener {
            intent = Intent(this, MakanActivity::class.java)
            startActivity(intent)
        }
        map5.setOnClickListener {
            intent = Intent(this, MapsActivity5::class.java)
            startActivity(intent)
        }
    }
}
