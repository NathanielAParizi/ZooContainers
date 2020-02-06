package com.example.zoocontainers

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_view_layout.view.*


class AnimalAdapter(val animalList : ArrayList<Animals>) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_view_layout, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }


    override fun getItemCount() = animalList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.populateItem(animalList[position])

    }

    fun addPersonToList(animals: Animals) {
        animalList.add(animals)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun populateItem(animals : Animals) {
            itemView.txtAnimal.text = animals.name

            itemView.setOnClickListener {
                val intent = Intent(it.context, AnimalDetailsActvitity::class.java)
                intent.putExtra(KEY_ANIMALS, animals)
                it.context.startActivity(intent)
            }
        }
    }


}