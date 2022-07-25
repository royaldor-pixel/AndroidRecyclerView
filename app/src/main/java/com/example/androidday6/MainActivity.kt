package com.example.androidday6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newsRecyclerView = findViewById<RecyclerView>(R.id.rv_news)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
        newsRecyclerView.adapter = NewsAdapter(this, newsList)
    }
}