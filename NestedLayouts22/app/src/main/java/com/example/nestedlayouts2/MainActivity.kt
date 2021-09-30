package com.example.nestedlayouts2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val viewText1: TextView = findViewById(R.id.textView)
        val viewText2: TextView = findViewById(R.id.textView2)
        val viewText3: TextView = findViewById(R.id.textView3)
        val viewText4: TextView = findViewById(R.id.textView4)
        val viewText5: TextView = findViewById(R.id.textView5)
        val viewText6: TextView = findViewById(R.id.textView6)
        val viewText7: TextView = findViewById(R.id.textView7)
        val viewText8: TextView = findViewById(R.id.textView8)
        val viewText9: TextView = findViewById(R.id.textView9)


        fun clear (textView1: TextView, textView2: TextView, textView3: TextView) {
            textView1.text = ""
            textView2.text = ""
            textView3.text = ""
        }
        var first = 1
        var second = 1
        var third = 1
        fun change (textView1: TextView, textView2: TextView, textView3: TextView) {
            textView1.text = (++first).toString()
            textView2.text = (++second).toString()
            textView3.text = (++third).toString()
        }
        var i = 1
        button.setOnClickListener {
            if (i % 3 == 0) {
                change(viewText1, viewText4, viewText8)
                clear(viewText2, viewText5, viewText9)
                clear(viewText3, viewText6, viewText7)
            }

            if (i % 3 == 1) {
                change(viewText2, viewText5, viewText9)
                clear(viewText1, viewText4, viewText8)
                clear(viewText3, viewText6, viewText7)
            }

            if (i % 3 == 2) {
                change(viewText3, viewText6, viewText7)
                clear(viewText2, viewText5, viewText9)
                clear(viewText1, viewText4, viewText8)
            }
            ++i
        }
    }

}