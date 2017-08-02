package com.anntony.k_gram.Views

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.view.View

import com.anntony.k_gram.R
import com.anntony.k_gram.Views.Fragments.HomeFragment
import com.anntony.k_gram.Views.Fragments.ProfileFragment
import com.anntony.k_gram.Views.Fragments.SearchFragment
import com.roughike.bottombar.OnTabReselectListener
import kotlinx.android.synthetic.main.botton_bar.*
import org.jetbrains.anko.contentView

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        bottombar.setDefaultTab(R.id.home)

        bottombar.setOnTabSelectListener {
            when(it){
                R.id.home -> supportFragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null).commit()

                R.id.search -> supportFragmentManager.beginTransaction()
                        .replace(R.id.container, SearchFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null).commit()

                R.id.profile -> supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ProfileFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null).commit()
            }
        }

    }
}
