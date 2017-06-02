package com.example.luissancar.gatos

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*

/**
 * Created by luissancar on 2/6/17.
 */
class ItemAdapter(val items:List<Item>,val listener: (Item)->Unit):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       return ViewHolder(parent.inflate(R.layout.view_item))
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        with (p0.itemView) {
            item_title.text = items[p1].title
            item_image.loadUrl(items[p1].url)
            setOnClickListener { listener(items[p1]) }
        }

    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

}