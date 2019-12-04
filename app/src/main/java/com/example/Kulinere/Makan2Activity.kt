package com.example.Kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_makan2.*

class Makan2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makan2)
        btn_back2.setOnClickListener {
            intent = Intent(this, MakanActivity::class.java)
            startActivity(intent)
        }
        map2.setOnClickListener {
            intent = Intent(this, MapsActivity2::class.java)
            startActivity(intent)
        }
    }
}
