package com.example.rockstar.kotlinstart

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        main_FB.setOnClickListener({
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"))
            startActivity(i)
        })
        main_Call.setOnClickListener({
            val intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:$9825846222")
            startActivity(intent)

        })
        main_Map.setOnClickListener({
            val map=Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?saddr=\" + 23.0225050 + \",\" + 72.5713620 + \"&daddr=\" + 23.0225050 + \",\" + 72.5713620"))
            startActivity(map)
        })
        val actionBar = supportActionBar
        supportActionBar!!.title = "After Login"
    }
}
