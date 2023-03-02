package com.blaszak.meditactionguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<LinearLayout>(R.id.mainLayout)
        val mainView = MainView()
        val initializer = ViewInitializer(mainLayout, mainView)
        initializer.init()
        initializer.initSetup()
    }
}