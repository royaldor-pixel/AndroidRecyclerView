package com.example.androidday6

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidday6.util.showToast

class NewsAdapter(private val activity: Activity, private val newsList: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() { //自定义ViewHolder
    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val newsTitle: TextView = view.findViewById(R.id.tv_title)
        val newsComme: TextView = view.findViewById(R.id.tv_comment)
        val newsPicture: ImageView = view.findViewById(R.id.iv_pic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        val newsViewHolder = NewsViewHolder(view)
        newsViewHolder.itemView.setOnClickListener {
            "You clicked the news".showToast(activity)
        }
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        holder.newsTitle.text = news.title
        holder.newsComme.text = news.comment
        //图片加载，需要在manifest中打开网络权限
        Glide.with(activity).load(news.imageUrl).into(holder.newsPicture)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

}