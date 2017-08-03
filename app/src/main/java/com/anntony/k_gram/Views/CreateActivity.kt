package com.anntony.k_gram.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anntony.k_gram.R
import kotlinx.android.synthetic.main.actionbar_toolbar.*

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        showToolbar("Create Account", true)
    }


    fun showToolbar(tittle: String, upButton: Boolean){
        setSupportActionBar(toolbar)
        this.title = tittle
        supportActionBar?.setDisplayHomeAsUpEnabled(upButton)
    }
}



