package com.anntony.k_gram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anntony.k_gram.R
import com.anntony.k_gram.Views.ContainerActivity
import com.anntony.k_gram.Views.CreateActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin.setOnClickListener{
            startActivity<ContainerActivity>()
        }

        createOnehere.setOnClickListener {
            startActivity<CreateActivity>()
        }
    }

}
