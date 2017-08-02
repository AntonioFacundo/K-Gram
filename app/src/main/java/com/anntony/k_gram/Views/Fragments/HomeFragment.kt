package com.anntony.k_gram.Views.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anntony.k_gram.Adapter.CardAdapterRecyclerView
import com.anntony.k_gram.Model.CardviewModel

import com.anntony.k_gram.R


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val returnView: View = inflater!!.inflate(R.layout.fragment_home, container, false)


      // val cardsRecycler: RecyclerView = returnView.findViewById(R.id.pictCard)
        /*
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context)

        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        cardsRecycler.layoutManager = linearLayoutManager

        val cardAdapterRecyclerView :CardAdapterRecyclerView =
                CardAdapterRecyclerView(
                        buildCards(),
                        activity,
                        R.layout.cardview_picture)

        cardsRecycler.adapter = cardAdapterRecyclerView*/

        return returnView
    }


    fun buildCards(): ArrayList<CardviewModel>{
        val cards: ArrayList<CardviewModel>? = ArrayList()
        cards?.add(CardviewModel(
                "https://uploads.toptal.io/blog/image/121111/toptal-blog-image-1472553848441-616cb981fb163d64c2d9d18a7e109d73.jpg",
                "Juan","3 días","4"))
        return cards!!
    }



}// Required empty public constructor


