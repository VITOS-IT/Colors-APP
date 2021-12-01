package com.example.colors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorView = findViewById<TextView>(R.id.textView)
        val clickRedView =findViewById<TextView>(R.id.textRed)
        val clickGreenView =findViewById<TextView>(R.id.textGreen)
        val clickBlueView =findViewById<TextView>(R.id.textBlue)

        clickRedView.setOnClickListener({
            colorView.setBackgroundColor(Color.RED)
            colorView.setText("Red")
        })
        clickGreenView.setOnClickListener({
            colorView.setBackgroundColor(Color.GREEN)
            colorView.setText("Green")
        })
        clickBlueView.setOnClickListener({
            colorView.setBackgroundColor(Color.BLUE)
            colorView.setText("Blue")
        })
    }
}