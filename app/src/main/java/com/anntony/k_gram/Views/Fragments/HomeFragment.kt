package com.anntony.k_gram.Views.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anntony.k_gram.Adapter.CardAdapterRecyclerView
import com.anntony.k_gram.Model.CardviewModel

import com.anntony.k_gram.R
import kotlinx.android.synthetic.main.actionbar_toolbar.*
import kotlinx.android.synthetic.main.actionbar_toolbar.view.*


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val returnView: View = inflater!!.inflate(R.layout.fragment_home, container, false)

        // Start toolbar

        showToolbar(tittle = "Home", upButton = false, view = returnView)
        //end toolbar


        val cardsRecycler = returnView.findViewById<RecyclerView>(R.id.cardRecycler) as RecyclerView

        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        cardsRecycler.layoutManager = linearLayoutManager

        val cardAdapterRecyclerView :CardAdapterRecyclerView =
                CardAdapterRecyclerView(
                        buildCards(),
                        activity,
                        R.layout.cardview_picture)

        cardsRecycler.adapter = cardAdapterRecyclerView

        return returnView
    }


    fun showToolbar(tittle: String, upButton: Boolean, view: View){
        val myToolbar: Toolbar = view.findViewById<Toolbar>(R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(myToolbar)
        (activity as AppCompatActivity).supportActionBar?.title = tittle
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(upButton)
    }

    fun buildCards(): ArrayList<CardviewModel>{
        val cards: ArrayList<CardviewModel>? = ArrayList()
        cards?.add(CardviewModel(
                "https://uploads.toptal.io/blog/image/121111/toptal-blog-image-1472553848441-616cb981fb163d64c2d9d18a7e109d73.jpg",
                "Juan","3 días","4"))
        return cards!!
    }



}// Required empty public constructor


