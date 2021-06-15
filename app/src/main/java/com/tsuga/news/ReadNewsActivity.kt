package com.tsuga.news

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.tsuga.news.core.domain.model.News
import com.tsuga.news.databinding.ActivityReadNewsBinding
import com.tsuga.news.readnews.ReadNews

class ReadNewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReadNewsBinding

    companion object {
        const val DATA = "data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        @Suppress("Deprecation")
        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
        )


        val data = intent.getParcelableExtra<News>("data")
        val bundle = Bundle()
        bundle.putParcelable("data", data)
        val fragment = ReadNews()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_read_container_view, fragment)
            .commit()
    }
}