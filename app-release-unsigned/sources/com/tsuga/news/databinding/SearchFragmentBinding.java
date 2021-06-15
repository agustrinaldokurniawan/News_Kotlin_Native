package com.tsuga.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.tsuga.news.R;

public final class SearchFragmentBinding implements ViewBinding {
    public final EditText etNews;
    public final ProgressBar pg;
    private final ConstraintLayout rootView;
    public final RecyclerView rvNews;
    public final TextView tvError;
    public final TextView tvHeadline;
    public final TextView tvHeadlineDesc;

    private SearchFragmentBinding(ConstraintLayout constraintLayout, EditText editText, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.etNews = editText;
        this.pg = progressBar;
        this.rvNews = recyclerView;
        this.tvError = textView;
        this.tvHeadline = textView2;
        this.tvHeadlineDesc = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SearchFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SearchFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.search_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SearchFragmentBinding bind(View view) {
        int i = R.id.et_news;
        EditText editText = (EditText) view.findViewById(R.id.et_news);
        if (editText != null) {
            i = R.id.pg;
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.pg);
            if (progressBar != null) {
                i = R.id.rv_news;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_news);
                if (recyclerView != null) {
                    i = R.id.tv_error;
                    TextView textView = (TextView) view.findViewById(R.id.tv_error);
                    if (textView != null) {
                        i = R.id.tv_headline;
                        TextView textView2 = (TextView) view.findViewById(R.id.tv_headline);
                        if (textView2 != null) {
                            i = R.id.tv_headline_desc;
                            TextView textView3 = (TextView) view.findViewById(R.id.tv_headline_desc);
                            if (textView3 != null) {
                                return new SearchFragmentBinding((ConstraintLayout) view, editText, progressBar, recyclerView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
