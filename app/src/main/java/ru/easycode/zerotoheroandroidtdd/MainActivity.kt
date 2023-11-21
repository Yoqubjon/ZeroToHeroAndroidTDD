package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.titleTextView)
        val button = findViewById<Button>(R.id.hideButton)

        button.setOnClickListener {
            textView.visibility = View.GONE
        }

        if (savedInstanceState != null) {
            textView.visibility = View.GONE
        }

    }
}