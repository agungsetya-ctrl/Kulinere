package com.example.kulinere

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_daftar.*
import org.json.JSONObject

class daftar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        d_daftar.setOnClickListener() {
            OnDaftar()
            intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        d_kembali.setOnClickListener() {
            intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
    private fun OnDaftar(){

        val loading = ProgressDialog(this)
        loading.setMessage("Menambahkan data...")
        loading.show()

        val user = ed_user2.getText().toString()
        val pass = ed_pass2.getText().toString()

        println(user+" "+pass)

        AndroidNetworking.post(Api.CREATE)
            .addBodyParameter("username",user)
            .addBodyParameter("password",pass)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {

                override fun onResponse(response: JSONObject?) {
                    Toast.makeText(applicationContext,"Sukses Terdaftar", Toast.LENGTH_SHORT).show()
                }
                override fun onError(anError: ANError?) {
                    loading.dismiss()
                    Log.d("ONERROR",anError?.errorDetail?.toString())
                    Toast.makeText(applicationContext,"Connection Failure", Toast.LENGTH_SHORT).show()
                }
            })
    }
}
