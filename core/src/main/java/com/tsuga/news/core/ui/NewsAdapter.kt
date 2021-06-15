package com.tsuga.news.core.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.tsuga.news.core.R
import com.tsuga.news.core.databinding.NewsItemBinding
import com.tsuga.news.core.domain.model.News

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ListViewHolder>() {

    private var listData = ArrayList<News>()
    var onItemClick: ((News) -> Unit)? = null

    fun setData(news: List<News>?) {
        if (news == null) return
        listData.clear()
        listData.addAll(news)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        )

    override fun getItemCount(): Int = listData.size


    override fun onBindViewHolder(holder: NewsAdapter.ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    @SuppressLint
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = NewsItemBinding.bind(itemView)
        fun bind(data: News) {
            with(binding) {
                Glide.with(itemView)
                    .load(data.urlToImage.orEmpty().ifEmpty { R.drawable.empty_news })
                    .placeholder(R.drawable.empty_news)
                    .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(13)))
                    .into(ivImage)
                tvTitle.text = data.title.orEmpty().ifEmpty { "[Empty Title]" }
                tvContent.text = data.description.orEmpty().ifEmpty { "[Empty Description]" }
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[absoluteAdapterPosition])
            }
        }
    }

}