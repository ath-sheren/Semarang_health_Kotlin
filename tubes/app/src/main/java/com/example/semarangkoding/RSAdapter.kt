package com.example.semarangkoding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class RSAdapter(var mContext : Context, var resources: Int, var items: List<RS>) : ArrayAdapter<RS>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from((mContext))
        val view: View = layoutInflater.inflate(resources, null)

        val imageViewRS: ImageView = view.findViewById(R.id.photoRS)
        val namaRS: TextView = view.findViewById(R.id.tvNamaRS)
        val deskripsiRS: TextView = view.findViewById(R.id.tvDeskripsiRS)

        var mItem: RS = items[position]
        imageViewRS.setImageDrawable(mContext.resources.getDrawable(mItem.photoRS))
        namaRS.text = mItem.namaRS
        deskripsiRS.text = mItem.deskripsiRS


        return view
    }
}