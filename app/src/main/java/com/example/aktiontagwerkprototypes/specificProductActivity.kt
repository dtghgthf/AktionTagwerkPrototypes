package com.example.aktiontagwerkprototypes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class specificProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specific_product)

        val back: ImageButton = findViewById(R.id.backToCategoryActivityBtn)

        back.setOnClickListener { backToCategories() }
    }

    private fun backToCategories() {
        intent = Intent(this@specificProductActivity, MainActivity::class.java)
        startActivity(intent)
    }
}