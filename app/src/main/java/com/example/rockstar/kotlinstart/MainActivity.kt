package com.example.rockstar.kotlinstart

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn.setOnClickListener {
            Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
            val intent = Intent(this, Othet_Activity::class.java)
            startActivity(intent);
        }
        val actionBar = supportActionBar
        supportActionBar!!.title = "Sign Up"
    }
}
