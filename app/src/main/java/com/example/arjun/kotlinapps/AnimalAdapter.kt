package com.example.arjun.kotlinapps

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item.view.*


class AnimalAdapter(val list:ArrayList<String>,val context: Context):RecyclerView.Adapter<AnimalAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item,p0,false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        holder.tvAnimalType.text=list.get(p1)

    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val tvAnimalType = view.tvanimaltype


    }

}