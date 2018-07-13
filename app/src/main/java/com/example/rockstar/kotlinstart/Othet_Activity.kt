package com.example.rockstar.kotlinstart

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_othet_.*

class Othet_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_othet_)

        main_login.setOnClickListener({

            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent);
        })
        val actionBar = supportActionBar
        supportActionBar!!.title = "Login"
    }
}
