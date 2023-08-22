package com.lesson.recyclerviewdeneme

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val sporListesi : ArrayList<String>, val sporIcerigi : ArrayList<String>, val sporGorselListesi : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>()  {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
val recyclerViewTextView: TextView=itemView.findViewById(R.id.recyclerViewTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return sporListesi.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.recyclerViewTextView.text=sporListesi.get(position)
        holder.itemView.setOnClickListener {
val intent=Intent(holder.itemView.context,Denemeres::class.java)
            intent.putExtra("sporIcerigi",sporIcerigi.get(position))
            intent.putExtra("sporGorselListesi",sporGorselListesi.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}