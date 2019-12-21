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
import kotlinx.android.synthetic.main.activity_login.*
import org.json.JSONObject

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        masukl.setOnClickListener() {
            CekLogin()
        }
        daftar.setOnClickListener() {
            intent = Intent(this, daftar::class.java)
            startActivity(intent)
        }
    }
    private fun CekLogin(){
        val loading = ProgressDialog(this)
        loading.setMessage("Memeriksa Data...")
        loading.show()

        val user = et_user.getText().toString()
        val pass = et_pass.getText().toString()

        AndroidNetworking.post(Api.READ1)
            .addBodyParameter("username",user)
            .addBodyParameter("password",pass)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject?){

                    val jsonArray = response?.optJSONArray("result")
                    loading.dismiss()

                    for(i in 0 until jsonArray?.length()!!) {
                        val jsonObject = jsonArray?.optJSONObject(i)
                        val id_pengguna = jsonObject.getString("id_daftar").toString()

                        if (jsonArray?.length()-1 == i) {
                            id_ambil.setText(id_pengguna)
                            val id_kirim = id_ambil.text
                            intent = Intent(this@login, HomeActivity::class.java)
                            intent.putExtra("id_daftar", id_kirim)
                            startActivity(intent)
                        }
                    }
                    if(id_ambil.getText() == "0"){
                        Toast.makeText(this@login, "Gagal Login", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onError(anError: ANError?){
                    loading.dismiss()
                    Log.d("ONERROR",anError?.errorDetail?.toString())
                    Toast.makeText(applicationContext,"Connection Failure", Toast.LENGTH_SHORT).show()
                }
            })
    }
}
