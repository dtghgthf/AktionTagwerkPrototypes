package com.example.aktiontagwerkprototypes

import CourseGVAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import android.widget.ImageButton

class kategorieActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategorie)

        val productGV: GridView = findViewById(R.id.productGridView)
        val back: ImageButton = findViewById(R.id.backBtn)

        back.setOnClickListener { backToMain() }

        val productArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()

        productArrayList.add(CourseModel("Produkt 1", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 2", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 3", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 4", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 5", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 6", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 7", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 8", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 9", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 10", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 11", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 12", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 13", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 14", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 15", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 16", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 17", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 18", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 19", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 20", R.drawable.ic_gfglogo_foreground))
        productArrayList.add(CourseModel("Produkt 21", R.drawable.ic_gfglogo_foreground))


        val adapter = CourseGVAdapter(this, productArrayList)
        productGV.adapter = adapter
    }

    private fun backToMain() {
        intent = Intent(this@kategorieActivity, MainActivity::class.java)
        startActivity(intent)
    }
}