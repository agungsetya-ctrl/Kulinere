package com.example.kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ListView
import com.example.Kulinere.*
import kotlinx.android.synthetic.main.activity_minum.*

class MinumActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_minum)
        listView = findViewById(R.id.listViewmnm)
        var list = mutableListOf<Modelmnm>()
        kembali2.setOnClickListener {
            intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        list.add(Modelmnm("Wedang Tahu Bu Kardi","sejenis makanan dengan olahan tahu lembut dan kuah gula Jawa dan jahe", R.drawable.wedang))
        list.add(Modelmnm("Es Cendol Pathi Onggok Pak Alex", "Rasanya segar, tidak terlalu manis. Sangat cocok dinikmati saat cuaca panas.", R.drawable.cendol))
        list.add(Modelmnm("Es Dawet Ngudi Roso", "Rasa Dawetnya enak apalagi di campur dgn tape ketan", R.drawable.dawet))
        list.add(Modelmnm("Es Teler Duren “Cendolku”", "salah satu susu kelapa dingin yang sering ditemui di Bandung, Jawa Barat", R.drawable.alpu))
        list.add(Modelmnm("Es Doger Krapyak","Rasanya enak Seger. Meskipun tempatnya agak sempit karena di pinggir jalan.", R.drawable.dog))

        listView.adapter = ListAdaptermnm(this, R.layout.rawminum,list)
        listView.setOnItemClickListener { parent, view, position, id ->
            if(position==0) {
                intent = Intent(this, Minum1Activity::class.java)
                startActivity(intent)
            }
            if(position==1) {
                intent = Intent(this, Minum2Activity::class.java)
                startActivity(intent)
            }
            if(position==2) {
                intent = Intent(this, Minum3Activity::class.java)
                startActivity(intent)
            }
            if(position==3) {
                intent = Intent(this, Minum4Activity::class.java)
                startActivity(intent)
            }
            if(position==4) {
                intent = Intent(this, Minum5Activity::class.java)
                startActivity(intent)
            }
        }
    }
}
