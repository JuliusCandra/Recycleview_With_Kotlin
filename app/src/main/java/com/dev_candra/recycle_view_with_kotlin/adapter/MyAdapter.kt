package com.dev_candra.recycle_view_with_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dev_candra.recycle_view_with_kotlin.R
import com.dev_candra.recycle_view_with_kotlin.model.model
import kotlinx.android.synthetic.main.layout_model.view.*
import java.util.ArrayList

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<model> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder1(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_model,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolder1 -> {
                holder.bind(items.get(position))
                holder.itemView.setOnClickListener {
                    when(position){
                        0 -> Toast.makeText(holder.itemView.context,"posisi1",Toast.LENGTH_SHORT).show()
                        1 -> Toast.makeText(holder.itemView.context,"posisi2",Toast.LENGTH_SHORT).show()
                        2 -> Toast.makeText(holder.itemView.context,"posisi3",Toast.LENGTH_SHORT).show()
                        3 -> Toast.makeText(holder.itemView.context,"posisi4",Toast.LENGTH_SHORT).show()
                        4 -> Toast.makeText(holder.itemView.context,"posisi5",Toast.LENGTH_SHORT).show()
                        5 -> Toast.makeText(holder.itemView.context,"posisi6",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    fun submitList(modelist : List<model>){
        items = modelist
    }

  class  ViewHolder1 constructor(
      itemView: View

  ): RecyclerView.ViewHolder(itemView){
      val gambar_os = itemView.gamar_os
      val tittle = itemView.teks1
      val version = itemView.teks2

      fun bind(modelSaya: model){
        tittle.setText(modelSaya.name.toUpperCase())
          version.setText(modelSaya.version.toLowerCase())
          gambar_os.setImageResource(modelSaya.gambar)
      }

  }

}