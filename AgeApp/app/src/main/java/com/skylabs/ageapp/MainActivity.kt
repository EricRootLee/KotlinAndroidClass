package com.skylabs.ageapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Month
import java.time.MonthDay
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener { view ->
            datePicker(view)
        }
        //  Toast.makeText(this,"Test",Toast.LENGTH_LONG).show()
    }

    private fun datePicker(view: View) {
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                calculateMinutes(selectedYear, selectedMonth + 1, selectedDayOfMonth)
                // Toast.makeText(this,"Choosen Year  $year", Toast.LENGTH_LONG).show()

            },
            year,
            month,
            day
        ).show()
    }

    private fun calculateMinutes(year: Any, month: Any, day: Any) {
        Toast.makeText(this, "The year is $year , $month , $day", Toast.LENGTH_LONG).show()

    }

}

