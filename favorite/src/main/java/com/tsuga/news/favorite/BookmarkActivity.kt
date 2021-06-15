package com.tsuga.news.favorite

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.tsuga.news.favorite.databinding.ActivityBookmarkBinding
import org.koin.core.context.loadKoinModules

class BookmarkActivity : AppCompatActivity() {
    private lateinit var decorView: View
    private lateinit var binding: ActivityBookmarkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookmarkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadKoinModules(favoriteModule)

        decorView = window.decorView
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        supportActionBar?.hide()

        supportFragmentManager.beginTransaction()
            .replace(R.id.bookmark_fragment_container_view, BookmarkFragment())
            .commit()
    }
}