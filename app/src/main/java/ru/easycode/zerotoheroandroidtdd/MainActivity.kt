package ru.easycode.zerotoheroandroidtdd

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count: Int = 0

    companion object {
        private const val COUNT_EXTRA = "count_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout = findViewById<LinearLayout>(R.id.rootLayout)
        val textView = findViewById<TextView>(R.id.countTextView)
        val button = findViewById<Button>(R.id.incrementButton)

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(COUNT_EXTRA)
        }
        textView.text = count.toString()

        button.setOnClickListener {
            count += 2
            textView.text = count.toString()
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(COUNT_EXTRA, count)
        super.onSaveInstanceState(outState)
    }
}