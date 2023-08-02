package com.samra.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samra.intentkotlin.databinding.ActivityMainBinding
import com.samra.intentkotlin.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var intentFromMain = intent
        var name = intentFromMain.getStringExtra("name")
        var age = intentFromMain.getIntExtra("age" , -1)
        binding.nameText.text = "Name: ${name}"
        println(age)

    }
}