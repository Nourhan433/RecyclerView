package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var contacts:List<Contact>):RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(view: View):RecyclerView.ViewHolder(view){
        val image:ImageView=view.findViewById(R.id.conact_image)
        val name=view.findViewById<TextView>(R.id.contact_name)
        val phone:TextView=view.findViewById(R.id.contact_phone)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int =contacts.size

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
       val contact=contacts[position]
        holder.image.setImageResource(contact.imageResId)
        holder.name.text=contact.name
        holder.phone.text=contact.phone
    }
}