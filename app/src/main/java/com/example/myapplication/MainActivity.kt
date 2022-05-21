package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener {
            Log.i("MainActivity","Button was touch !")
            Toast.makeText(this,"Button is touch !",Toast.LENGTH_SHORT).show()
        }
       binding.button2.setOnClickListener {
           val message: String=binding.editText.text.toString()
           Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
       }

    }
}