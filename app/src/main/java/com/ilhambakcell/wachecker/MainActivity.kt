package com.ilhambakcell.wachecker

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(50, 50, 50, 50)
        }

        val title = TextView(this).apply {
            text = "Ilham Bakcell WhatsApp Checker"
            textSize = 24f
            gravity = android.view.Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "10.000 Numarayı Yükle ve Doğrula"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Ilham Bakcell API Sunucusuna Bağlanılıyor...", Toast.LENGTH_LONG).show()
            }
        }

        layout.addView(title)
        layout.addView(button)
        setContentView(layout)
    }
}
