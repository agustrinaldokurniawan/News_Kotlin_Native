package com.tsuga.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.tsuga.news.R;

public final class ReadNewsFragmentBinding implements ViewBinding {
    public final View bottomContent;
    public final ImageButton btnBookmark;
    public final Button btnReadMore;
    public final View containerContent;
    public final View containerTop;
    public final ImageView ivImage;
    private final ScrollView rootView;
    public final RecyclerView rvNews;
    public final TextView tvContent;
    public final TextView tvDate;
    public final TextView tvHeadline;
    public final TextView tvSource;
    public final TextView tvTitle;

    private ReadNewsFragmentBinding(ScrollView scrollView, View view, ImageButton imageButton, Button button, View view2, View view3, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.bottomContent = view;
        this.btnBookmark = imageButton;
        this.btnReadMore = button;
        this.containerContent = view2;
        this.containerTop = view3;
        this.ivImage = imageView;
        this.rvNews = recyclerView;
        this.tvContent = textView;
        this.tvDate = textView2;
        this.tvHeadline = textView3;
        this.tvSource = textView4;
        this.tvTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ReadNewsFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReadNewsFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.read_news_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ReadNewsFragmentBinding bind(View view) {
        int i = R.id.bottom_content;
        View findViewById = view.findViewById(R.id.bottom_content);
        if (findViewById != null) {
            i = R.id.btn_bookmark;
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.btn_bookmark);
            if (imageButton != null) {
                i = R.id.btn_read_more;
                Button button = (Button) view.findViewById(R.id.btn_read_more);
                if (button != null) {
                    i = R.id.container_content;
                    View findViewById2 = view.findViewById(R.id.container_content);
                    if (findViewById2 != null) {
                        i = R.id.container_top;
                        View findViewById3 = view.findViewById(R.id.container_top);
                        if (findViewById3 != null) {
                            i = R.id.iv_image;
                            ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
                            if (imageView != null) {
                                i = R.id.rv_news;
                                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_news);
                                if (recyclerView != null) {
                                    i = R.id.tv_content;
                                    TextView textView = (TextView) view.findViewById(R.id.tv_content);
                                    if (textView != null) {
                                        i = R.id.tv_date;
                                        TextView textView2 = (TextView) view.findViewById(R.id.tv_date);
                                        if (textView2 != null) {
                                            i = R.id.tv_headline;
                                            TextView textView3 = (TextView) view.findViewById(R.id.tv_headline);
                                            if (textView3 != null) {
                                                i = R.id.tv_source;
                                                TextView textView4 = (TextView) view.findViewById(R.id.tv_source);
                                                if (textView4 != null) {
                                                    i = R.id.tv_title;
                                                    TextView textView5 = (TextView) view.findViewById(R.id.tv_title);
                                                    if (textView5 != null) {
                                                        return new ReadNewsFragmentBinding((ScrollView) view, findViewById, imageButton, button, findViewById2, findViewById3, imageView, recyclerView, textView, textView2, textView3, textView4, textView5);
                                                    }
                                                }
                                            }
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
