package com.example.aktiontagwerkprototypes

import CourseGVAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coursesGV: GridView = findViewById(R.id.genresGridView)
        val vorschlaegeGV: GridView = findViewById(R.id.vorschlägeGridView)

        val courseModelArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()
        val vorschlaegeArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()

        courseModelArrayList.add(CourseModel("Handy", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Tablet", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Laptop", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Monitor", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Mikrofon", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Kopfhörer", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("PC", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Lautsprecher", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Konsolen", R.drawable.ic_gfglogo_foreground))
        courseModelArrayList.add(CourseModel("Mäuse", R.drawable.ic_gfglogo_foreground))

        vorschlaegeArrayList.add(CourseModel("Corsair H70 Wireless Pro", R.drawable.ic_gfglogo_foreground))
        vorschlaegeArrayList.add(CourseModel("MEDION ERAZER Engineer P10", R.drawable.ic_gfglogo_foreground))
        vorschlaegeArrayList.add(CourseModel("Razer DeathAdder Essential", R.drawable.ic_gfglogo_foreground))
        vorschlaegeArrayList.add(CourseModel("Cherry Maus MW 2310", R.drawable.ic_gfglogo_foreground))

        val adapter = CourseGVAdapter(this, courseModelArrayList)
        coursesGV.adapter = adapter

        val vorschlaegeAdapter = CourseGVAdapter(this, vorschlaegeArrayList)
        vorschlaegeGV.adapter = vorschlaegeAdapter

        coursesGV.setOnItemClickListener { parent, view, position, id ->
            startActivity(Intent(this@MainActivity, kategorieActivity::class.java))
        }

    }
}