package com.tsuga.news

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.tsuga.news.databinding.ActivityWebViewBinding
import com.tsuga.news.readnews.WebView

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    companion object{
        const val URL = "url"
        const val TITLE = "title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        @Suppress("Deprecation")
        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
        )


        val url = intent.getStringExtra("url")
        val title = intent.getStringExtra("title")

        val bundle = Bundle()
        bundle.putString("url", url)
        bundle.putString("title", title)
        val fragment = WebView()
        fragment.arguments = bundle


        supportFragmentManager.beginTransaction()
            .replace(R.id.webview_fragment_container_view, fragment)
            .commit()

    }
}