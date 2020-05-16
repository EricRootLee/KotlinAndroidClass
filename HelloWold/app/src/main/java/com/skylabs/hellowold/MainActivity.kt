package com.skylabs.hellowold

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button2)
         var clicked:Int = 0;
        btn.setOnClickListener {
            clicked = clicked +1
            text.text = "You Clicked Me $clicked Times";
            Toast.makeText(this,"You Clicked me" , Toast.LENGTH_LONG).show()
        }

    }
}
