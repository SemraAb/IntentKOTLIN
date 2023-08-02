package com.samra.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.samra.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        println("on create")
    }

    override fun onStart() {
        super.onStart()
        println("Onstart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }
    override fun onStop() {
        super.onStop()
        println("onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }

    fun next(view: View){
        var intent = Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("name" , binding.editText.text.toString())
        intent.putExtra("age" , 12)
        startActivity(intent)
        finish()
    }
}