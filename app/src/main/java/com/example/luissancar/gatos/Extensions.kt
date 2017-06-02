package com.example.luissancar.gatos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by luissancar on 2/6/17.
 */


fun Context.toast(text:CharSequence){  //Contetx se ejecutaría como dentro de la clase, para usar this
    Toast.makeText(this,text, Toast.LENGTH_LONG).show()
}


fun ViewGroup.inflate(LayoutRes:Int): View {
    return LayoutInflater.from(context).inflate(LayoutRes,this,false)
}


fun ImageView.loadUrl(url:String){
    Picasso.with(context).load(url).into(this)
}