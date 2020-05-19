package com.skylabs.hellowold

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // var text = findViewById<TextView>(R.id.textView)
        //   val btn = findViewById<Button>(R.id.button2)
        var clicked = 0
        button2.setOnClickListener {
            //  clicked = clicked +1
            clicked += 1
            textView.text = "You Clicked Me $clicked Times";
            Toast.makeText(this, "You Clicked me", Toast.LENGTH_LONG).show()
        }
    }
}
