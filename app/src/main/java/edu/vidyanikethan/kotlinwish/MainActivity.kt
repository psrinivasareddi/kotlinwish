package edu.vidyanikethan.kotlinwish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayTime(view: android.view.View) {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        var str:String=""
        //println(hour);
        when(hour)
        {
            in 0..11 -> str="Good Morning"
            in 12..16-> str="Good Afternoon"
            else -> str="Good Evening"
        }

        Toast.makeText(this,str.toString(),Toast.LENGTH_LONG).show();
    }

}