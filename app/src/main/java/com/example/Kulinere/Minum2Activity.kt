package com.example.Kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_minum2.*

class Minum2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minum2)
        back2.setOnClickListener {
            intent = Intent(this, MinumActivity::class.java)
            startActivity(intent)
        }
    }
}
