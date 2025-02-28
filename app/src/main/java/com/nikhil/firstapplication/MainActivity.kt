package com.nikhil.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var button: Button?=null
        var button2:Button?=null
        var button3:Button?=null
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button=findViewById(R.id.btnsignup)
        button?.setOnClickListener()
        {
            var intent=Intent(this,RelativeActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"My button is clicked",Toast.LENGTH_SHORT).show()
        }
        button2=findViewById(R.id.btngoogle)
        button2.setOnClickListener()
        {
            var intent1=Intent(this,google::class.java)
            startActivity(intent1)
            Toast.makeText(this,"google button is clicked",Toast.LENGTH_SHORT).show()
        }

    }
}