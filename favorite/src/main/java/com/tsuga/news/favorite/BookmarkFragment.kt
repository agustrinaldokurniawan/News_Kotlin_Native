package com.tsuga.news.favorite

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tsuga.news.ReadNewsActivity
import com.tsuga.news.core.ui.NewsAdapter
import com.tsuga.news.favorite.databinding.BookmarkFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class BookmarkFragment : Fragment() {
    private var _binding: BookmarkFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BookmarkViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BookmarkFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val newsAdapter = NewsAdapter()

            newsAdapter.onItemClick = {

                val intent = Intent(activity, ReadNewsActivity::class.java)
                intent.putExtra(ReadNewsActivity.DATA, it)
                startActivity(intent)
            }

            viewModel.news.observe(viewLifecycleOwner, {
                newsAdapter.setData(it)
            })

            binding.etNews.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                    viewModel.searchQueryBookmark(s.toString())
                        .observe(viewLifecycleOwner, { query_data ->
                            query_data.let {
                                newsAdapter.setData(it)
                            }
                        })
                }

                override fun afterTextChanged(s: Editable?) {

                }

            })

            with(binding.rvNews) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = newsAdapter
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}