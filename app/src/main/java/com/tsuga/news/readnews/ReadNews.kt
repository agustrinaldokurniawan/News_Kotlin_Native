package com.tsuga.news.readnews

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.tsuga.news.R
import com.tsuga.news.ReadNewsActivity
import com.tsuga.news.WebViewActivity
import com.tsuga.news.core.domain.model.News
import com.tsuga.news.core.ui.NewsAdapter
import com.tsuga.news.databinding.ReadNewsFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.SimpleDateFormat
import java.util.*

class ReadNews : Fragment() {
    private lateinit var binding: ReadNewsFragmentBinding
    private val viewModel: ReadNewsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ReadNewsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsAdapter = NewsAdapter()

        newsAdapter.onItemClick = {
            val bundle = Bundle()
            bundle.putParcelable("data", it)
            val fragment = ReadNews()
            fragment.arguments = bundle

            val intent = Intent(activity, ReadNewsActivity::class.java)
            intent.putExtra(ReadNewsActivity.DATA, it)
            startActivity(intent)
        }

        val data = arguments?.getParcelable<News>("data")
        if (data != null) {
            setBookmark(data.isBookmark)
        }

        binding.apply {
            Glide.with(view)
                .load(data?.urlToImage.orEmpty().ifEmpty { R.drawable.empty_news })
                .apply(
                    RequestOptions().transform(
                        CenterCrop(),
                        GranularRoundedCorners(0F, 0F, 50F, 40F)
                    )
                )
                .into(ivImage)
            tvTitle.text = data?.title
            tvSource.text = data?.source
            tvContent.text = data?.content

            val formatter1 = SimpleDateFormat("yyyy-MM-dd")
            val formatter2 = SimpleDateFormat("dd MMMM yyyy")
            val date1 = formatter1.parse(data?.publishedAt)
            val date = formatter2.format(date1)

            tvDate.text = date.toString()
            btnBookmark.setOnClickListener {
                val statusBookmark = !data?.isBookmark!!
                viewModel.setBookmarkNews(data, statusBookmark)
                setBookmark(statusBookmark)
            }
            btnReadMore.setOnClickListener {
                openUrl(data?.url, data?.title)
            }
        }

        viewModel.news.observe(viewLifecycleOwner, {
            if (it != null) {
                when (it) {
                    is com.tsuga.news.core.data.Resource.Loading -> {
                    }
                    is com.tsuga.news.core.data.Resource.Success -> {
                        newsAdapter.setData(it.data)
                    }
                    is com.tsuga.news.core.data.Resource.Error -> {
                    }
                }
            }
        })
        with(binding.rvNews) {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = newsAdapter
        }
    }

    private fun openUrl(url: String?, title: String?) {

        val intent = Intent(activity, WebViewActivity::class.java)
        intent.putExtra(WebViewActivity.URL, url)
        intent.putExtra(WebViewActivity.TITLE, title)
        startActivity(intent)
    }

    private fun setBookmark(statusBookmark: Boolean) {
        if (statusBookmark) {
            binding.btnBookmark.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.ic_baseline_bookmark_24_white
                )
            )
        } else {
            binding.btnBookmark.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.ic_baseline_bookmark_border_24
                )
            )
        }

    }
}