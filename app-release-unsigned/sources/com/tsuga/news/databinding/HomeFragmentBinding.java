package com.tsuga.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.tsuga.news.R;

public final class HomeFragmentBinding implements ViewBinding {
    public final Button btnReadMore;
    public final View containerTop;
    public final ImageView ivImage;
    public final ProgressBar pg;
    private final ScrollView rootView;
    public final RecyclerView rvNews;
    public final TextView tvError;
    public final TextView tvHeadline;
    public final TextView tvSource;
    public final TextView tvTitle;

    private HomeFragmentBinding(ScrollView scrollView, Button button, View view, ImageView imageView, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.btnReadMore = button;
        this.containerTop = view;
        this.ivImage = imageView;
        this.pg = progressBar;
        this.rvNews = recyclerView;
        this.tvError = textView;
        this.tvHeadline = textView2;
        this.tvSource = textView3;
        this.tvTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static HomeFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HomeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.home_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static HomeFragmentBinding bind(View view) {
        int i = R.id.btn_read_more;
        Button button = (Button) view.findViewById(R.id.btn_read_more);
        if (button != null) {
            i = R.id.container_top;
            View findViewById = view.findViewById(R.id.container_top);
            if (findViewById != null) {
                i = R.id.iv_image;
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
                if (imageView != null) {
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
                                    i = R.id.tv_source;
                                    TextView textView3 = (TextView) view.findViewById(R.id.tv_source);
                                    if (textView3 != null) {
                                        i = R.id.tv_title;
                                        TextView textView4 = (TextView) view.findViewById(R.id.tv_title);
                                        if (textView4 != null) {
                                            return new HomeFragmentBinding((ScrollView) view, button, findViewById, imageView, progressBar, recyclerView, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
