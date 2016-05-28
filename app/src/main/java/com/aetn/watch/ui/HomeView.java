package com.aetn.watch.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.aetn.watch.R;
import com.aetn.watch.home.HomeViewModel;

/**
 * Created by nelsonramirez on 5/17/16.
 */
public class HomeView extends StatefulBaseView {
    private final TextView emptyText;

    public HomeView(Context context) {
        this(context, null);
    }

    public HomeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        addView(inflate(context, R.layout.home_view, this));

        //TODO injection

        emptyText = (TextView) findViewById(R.id.empty_text);
    }

    public void onViewModelUpdate(HomeViewModel homeViewModel) {
        if (homeViewModel != null) {
            populate(homeViewModel);
        }
    }

    private void populate(HomeViewModel homeViewModel) {
        emptyText.setText(homeViewModel.getEmptyTextResId());
    }
}
