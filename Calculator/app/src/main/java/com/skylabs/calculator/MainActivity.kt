package com.skylabs.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d : Double = 2.0000000
        val text : Double? = Math.floor(d)

    }

    fun onDigit(view:View){

        Toast.makeText(this,"It works",Toast.LENGTH_LONG).show()
    }
}
