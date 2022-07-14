package com.example.semarangkoding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ArtikelAdapter(var mContext : Context, var resources: Int, var items: List<artikel>) : ArrayAdapter<artikel>(mContext, resources, items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from((mContext))
        val view: View = layoutInflater.inflate(resources, null)

        val imageViewArtikel: ImageView = view.findViewById(R.id.photoArtikel)
        val namaArtikel: TextView = view.findViewById(R.id.tvNamaArtikel)
        val deskripsiArtikel: TextView = view.findViewById(R.id.tvDeskripsiArtikel)

        var mItem:artikel = items[position]
        imageViewArtikel.setImageDrawable(mContext.resources.getDrawable(mItem.photoArtikel))
        namaArtikel.text=mItem.namaArtikel
        deskripsiArtikel.text=mItem.deskripsiArtikel


        return view
    }
}