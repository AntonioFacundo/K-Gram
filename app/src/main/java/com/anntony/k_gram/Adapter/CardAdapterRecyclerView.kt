package com.anntony.k_gram.Adapter

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.anntony.k_gram.Model.CardviewModel
import com.anntony.k_gram.R
import com.squareup.picasso.Picasso


/**
 * Created by Antonio Facundo on 22/07/2017.
 */

class CardAdapterRecyclerView(
        var items: ArrayList<CardviewModel>,
        var activity: Activity,
        var resource: Int)
: RecyclerView.Adapter<CardAdapterRecyclerView.CardViewHolder>() {

    override fun onBindViewHolder(holder: CardViewHolder?, position: Int) {
        val item: CardviewModel    = items[position]
        holder?.userName?.text     = item.userName
        holder?.timePost?.text     = item.time
        holder?.likes?.text        = item.likes
        Picasso.with(activity).load(item.picture).into(holder?.imageView)

    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(resource, parent, false)

        return CardViewHolder(itemView = view)
    }

    class CardViewHolder(itemView: View?,
                         val imageView:ImageView?    = itemView?.findViewById(R.id.imageCard),
                         val userName: TextView?     = itemView?.findViewById(R.id.userNameCard),
                         val timePost: TextView?     = itemView?.findViewById(R.id.secondwordCard),
                         val likes: TextView?        = itemView?.findViewById(R.id.likes))
        :RecyclerView.ViewHolder(itemView)
}
