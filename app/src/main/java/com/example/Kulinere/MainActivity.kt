package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Handler as Handler1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        // btn_klik.setOnClickListener {
        //   intent = Intent(this, HomeActivity::class.java)
        //     startActivity(intent)
        // }
        Handler().postDelayed({
            startActivity(Intent(this, daftar::class.java))
        },4000)
    }
}
