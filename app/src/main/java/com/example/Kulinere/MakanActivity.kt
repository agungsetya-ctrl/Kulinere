package com.example.Kulinere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_makan.*

class MakanActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_makan)
        listView = findViewById(R.id.listViewmkn)
        var list = mutableListOf<Modelmkn>()
        Kembali1.setOnClickListener {
            intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        list.add(Modelmkn("Ayam bakar Genther pak Yanto","Ayam Bakar dengan siraman saus racikan rempah rempah", R.drawable.ayamb))
        list.add(Modelmkn("Sate Padang Ajo Buyuang", "Sate khas Sumatera Barat dengan citarasa Kuah kental beraroma rempah", R.drawable.sate))
        list.add(Modelmkn("Mie Ayam TPMC", "Porsi mienya banyak dan tekstur mienya lembut", R.drawable.mie))
        list.add(Modelmkn("Warung Yellow Nasi Kuning", "Sepuluhriburupiah udah bisa dapet seporsi nasi kuning pake ayam lohh ", R.drawable.kuning))
        list.add(Modelmkn("Siomay Jakarta Kang Ujang", "dari teksturnya yang lembut tapi masih agak chewy, apalagi kalo di goreng", R.drawable.daging))

listView.adapter = ListAdaptermkn(this, R.layout.rawmakan,list)

        listView.setOnItemClickListener { parent, view, position, id ->
            if(position==0) {
                intent = Intent(this, Makan1Activity::class.java)
                startActivity(intent)
            }
            if(position==1) {
                intent = Intent(this, Makan2Activity::class.java)
                startActivity(intent)
            }
            if(position==2) {
                intent = Intent(this, Makan3Activity::class.java)
                startActivity(intent)
            }
            if(position==3) {
                intent = Intent(this, Makan4Activity::class.java)
                startActivity(intent)
            }
            if(position==4) {
                intent = Intent(this, Makan5Activity::class.java)
                startActivity(intent)
            }
        }

    }
}
