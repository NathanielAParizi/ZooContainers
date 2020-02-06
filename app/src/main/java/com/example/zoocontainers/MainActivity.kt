package com.example.zoocontainers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClick(view: View) {

        when (view.id) {

            R.id.animalButton -> {
                intent = Intent(this, AnimalList::class.java)
                startActivity(intent)
            }
            R.id.categorieButton -> {
                intent = Intent(this, CategoryList::class.java)
                startActivity(intent)

            }

        }

    }
}
