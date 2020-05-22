package com.skylabs.ageapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.text.SimpleDateFormat
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

      val dpd =  DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                calculateMinutes(selectedYear, selectedMonth + 1, selectedDayOfMonth)

            },
            year,
            month,
            day
        )
        dpd.datePicker.setMaxDate(Date().time - 84600000)
        dpd.show()
    }

    private fun calculateMinutes(year: Any, month: Any, day: Any) {
        val selecteddate= "$day/$month/$year"
        tv.setText(selecteddate)
        val sdf = SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH)
        val thedate = sdf.parse(selecteddate)
        val selecteddateinMinutes = thedate!!.time / 60000
        val currentdate = sdf.parse(sdf.format(System.currentTimeMillis()))
        val currentdayinmin = currentdate!!.time /60000
        val minutes = (currentdayinmin - selecteddateinMinutes).toString()
           ageInMinutes.setText(minutes)

    }

}

