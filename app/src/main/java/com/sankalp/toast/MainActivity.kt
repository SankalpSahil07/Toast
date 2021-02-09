package com.sankalp.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonClick)

        button.setOnClickListener {
           // Toast.makeText(this@MainActivity,"Toast Message Successfully Displayed",Toast.LENGTH_SHORT).show()
            val text =  "Toast Message Successfully Displayed..!!!"
            val duration = Toast.LENGTH_LONG
            val  toast = Toast.makeText(applicationContext,text,duration)
            toast.show()
        }

    }
}