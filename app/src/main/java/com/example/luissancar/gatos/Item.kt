package com.example.luissancar.gatos

/**
 * Created by luissancar on 2/6/17.
 */

data class Item(val id:Long,val title:String,val url:String)

fun getItems():List<Item>{
    return (1..10).map { Item(it.toLong(),"Gato $it", "http://lorempixel.com/400/400/cats/$it/") }
}
/*

class Item {
    var title:String=""
    get() {
        return "Título $field"
    }
    set(value) {
        field="titulo $value"
    }
    var url:String=""
}
 */