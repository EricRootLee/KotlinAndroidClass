package com.skylabs.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException


class MainActivity : AppCompatActivity() {

    var lastNumeric: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d: Double = 2.0000000
        val text: Double? = Math.floor(d)

    }

    fun onDigit(view: View) {
        tvInput.append((view as Button).text)
        Toast.makeText(this, "It works", Toast.LENGTH_LONG).show()
        lastNumeric = true
    }

    fun clear(view: View) {
        tvInput.text = " "
        lastNumeric = false
        lastDot = false
    }

    fun onDecimal(view: View) {
        if (lastNumeric && !lastDot) {
            tvInput.append(".")
            lastDot = true
            lastNumeric = false
        }
    }

    fun operator(view: View) {
        if (lastNumeric && !isoperatoravailable(tvInput.text.toString())) {
            tvInput.append((view as Button).text)
            lastDot = false
            lastNumeric = false
        }
    }

    private fun isoperatoravailable(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/") || value.contains("+") || value.contains("-") || value.contains("*")

        }
    }

    fun oNequal(view: View) {
        if (lastNumeric) {
            var tvValue = tvInput.text.toString()
            var prefix = ""
            try {
                if (tvValue.startsWith("-")) {
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }
                if (tvValue.contains("-")) {
                    val spltvalue = tvValue.split("-")
                    var valuone = spltvalue[0]
                    var valuetwo = spltvalue[1]
                    if (!prefix.isEmpty()) {
                        valuone = prefix + valuone
                    }
                    tvInput.text = (valuone.toDouble() - valuetwo.toDouble()).toString()
                } else if (tvValue.contains("+")) {
                    val spltvalue = tvValue.split("+")
                    var valuone = spltvalue[0]
                    var valuetwo = spltvalue[1]
                    if (!prefix.isEmpty()) {
                        valuone = prefix + valuone
                    }
                    tvInput.text = (valuone.toDouble() + valuetwo.toDouble()).toString()
                } else if (tvValue.contains("/")) {
                    val spltvalue = tvValue.split("/")
                    var valuone = spltvalue[0]
                    var valuetwo = spltvalue[1]
                    if (!prefix.isEmpty()) {
                        valuone = prefix + valuone
                    }
                    tvInput.text = (valuone.toDouble() / valuetwo.toDouble()).toString()
                } else if (tvValue.contains("*")) {
                    val spltvalue = tvValue.split("*")
                    var valuone = spltvalue[0]
                    var valuetwo = spltvalue[1]
                    if (!prefix.isEmpty()) {
                        valuone = prefix + valuone
                    }
                    tvInput.text = (valuone.toDouble() * valuetwo.toDouble()).toString()
                }

            } catch (e: ArithmeticException) {
                e.printStackTrace()

            }
        }


    }
}
