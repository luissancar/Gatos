package com.example.luissancar.gatos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.view_item.*

class Main2Activity : AppCompatActivity() {
    companion object{  // estático
        val EXTRA_ID="GetailActivity:id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val id=intent.getLongExtra(EXTRA_ID,-1)
        val item= getItems().firstOrNull(){it.id==id}
        if (item!= null){
            item_image.loadUrl(item.url)
            item_title.text=item.title
        }
    }
}
