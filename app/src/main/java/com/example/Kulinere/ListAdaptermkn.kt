package com.example.Kulinere

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdaptermkn (var mCtx: Context, var resource:Int, var items:List<Modelmkn>)
    : ArrayAdapter<Modelmkn>( mCtx , resource , items ){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView : ImageView = view.findViewById(R.id.iconMkn)
        var textView : TextView = view.findViewById(R.id.titleMkn)
        var textView1 : TextView = view.findViewById(R.id.descMkn)


        var person : Modelmkn = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(person.photo))
        textView.text = person.title
        textView1.text = person.desc


        return view
    }
}