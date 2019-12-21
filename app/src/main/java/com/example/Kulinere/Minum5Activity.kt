package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_minum1.*
import kotlinx.android.synthetic.main.activity_minum5.*

class Minum5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minum5)
        back5.setOnClickListener {
            intent = Intent(this, MinumActivity::class.java)
            startActivity(intent)
        }
        peta5.setOnClickListener {
            intent = Intent(this, MapsActivitym5::class.java)
            startActivity(intent)
        }
    }
}
