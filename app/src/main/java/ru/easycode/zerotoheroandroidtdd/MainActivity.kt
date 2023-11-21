package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout = findViewById<LinearLayout>(R.id.rootLayout)
        val textView = findViewById<TextView>(R.id.titleTextView)
        val button = findViewById<Button>(R.id.removeButton)

        button.setOnClickListener {
            rootLayout.removeViewAt(0)
        }

        if (savedInstanceState != null) {
            rootLayout.removeViewAt(0)
        }
    }
}