package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        btn_mkn.setOnClickListener {
            intent = Intent (this, MakanActivity::class.java)
            startActivity(intent)
        }

        btn_mnm.setOnClickListener {
            intent = Intent (this, MinumActivity::class.java)
            startActivity(intent)
        }
    }
}
