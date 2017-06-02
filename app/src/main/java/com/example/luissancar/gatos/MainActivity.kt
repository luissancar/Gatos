package com.example.luissancar.gatos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager=GridLayoutManager(this,2)
        recycler.adapter=ItemAdapter(getItems()){
            item ->val intent=Intent(this,Main2Activity::class.java)
            intent.putExtra(Main2Activity.EXTRA_ID,item.id)
            startActivity(intent)
        }
    }
}
