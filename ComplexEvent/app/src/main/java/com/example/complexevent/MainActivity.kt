package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private var progressStatus = 0
    private var handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val textView: TextView = findViewById(R.id.textView)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val button: Button = findViewById(R.id.button)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)

        checkBox.setOnCheckedChangeListener { // Проверка checkBox на флажок
                _, isChecked ->
            button.setOnClickListener() {

                if (isChecked) {
                    Thread(Runnable {
                        while (progressStatus < 100){
                            progressStatus +=10 // На сколько увеличивать StatusBar

                            Thread.sleep(100)

                            // Запись в StatusBar
                            handler.post {
                                progressBar.progress = progressStatus
                                val text = editText.text.toString() // Текст из EditText
                                textView.text = text // Установка текста в TextView
                            }
                        }
                    }).start()

                    val text = editText.text.toString() // Текст из EditText
                    textView.text = text // Установка текста в TextView

                    //progressBar.progress = progressBar.progress + 10;
                } else {
                    textView.text = "Поставьте флажок."
                }
            }
        }
    }
}
