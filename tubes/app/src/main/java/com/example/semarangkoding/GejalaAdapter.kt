package com.example.semarangkoding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GejalaAdapter(var mContext : Context, var resources: Int, var items: List<gejala>) : ArrayAdapter<gejala>(mContext, resources, items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from((mContext))
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.photo)
        val namagejala: TextView = view.findViewById(R.id.tvNama)
        val deskripsi: TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:gejala = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        namagejala.text=mItem.nama
        deskripsi.text=mItem.deskripsi


        return view
    }
}