package com.example.zoocontainers

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_animal_list.*

class AnimalList : AppCompatActivity() {

    val personList by lazy { poplateList() }
    val adapter by lazy  {AnimalAdapter(personList)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_list)
        initRecyclerView()
    }


    private fun initRecyclerView() {

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvList.layoutManager = layoutManager
        rvList.adapter = adapter
    }


    private fun poplateList(): ArrayList<Animals> {
        val returnList = ArrayList<Animals>()
        returnList.add(Animals("Aligator", "The aligator will eat you"))
        returnList.add(Animals("Snake", "The snake is venomous"))
        returnList.add(Animals("Iguana", "The iguana is Miami's excuse for a pigeon"))
        returnList.add(Animals("Parrot", "Never tell a parrot secrets"))
        returnList.add(Animals("Raven", "The raven is knocking at my chamber door"))
        returnList.add(Animals("Owl", "The owl can hear from far away."))
        returnList.add(Animals("Elephant", "The elephant is smart"))
        returnList.add(Animals("Lion", "The lion is king of the jungle"))
        returnList.add(Animals("Tiger", "The tiger is as strong as a lion"))
        returnList.add(Animals("Dolphin", "The dolphin is playful"))
        returnList.add(Animals("Shark", "The shark cannot swim upside down"))
        returnList.add(Animals("Electric Eel", "The electric eel is natures excuse for Pikachu"))
        returnList.add(Animals("Tetrapod", "The tetrapod is extinct but we have one"))


        return returnList
    }

}
