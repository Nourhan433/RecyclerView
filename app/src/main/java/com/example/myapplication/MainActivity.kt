package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ContactAdapter
    lateinit var contact: ArrayList<Contact>
    lateinit var recyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       contact= arrayListOf(
           Contact("nourhan","989923787",R.drawable.profile),
           Contact("ahmed","034",R.drawable.profile),
           Contact("ahmed","034",R.drawable.profile),
           Contact("ahmed","034",R.drawable.profile),
           Contact("ahmed","034",R.drawable.profile),
           Contact("ahmed","034",R.drawable.profile),
           Contact("ahmed","034",R.drawable.profile),
       )
        recyclerView=findViewById(R.id.recyclerview)
        adapter= ContactAdapter(contact)
        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=adapter
    }
}