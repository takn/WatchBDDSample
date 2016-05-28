package com.aetn.watch;

import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.aetn.watch.home.HomeViewModel;

public class UiTestHarnessActivity extends AppCompatActivity {

    private TextView emptyText;
    private ProgressBar loadingPb;
    private TextView updatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //these 'generic' views can either go in a base class or handled case by case
        emptyText = (TextView) findViewById(R.id.empty_text);
        loadingPb = (ProgressBar) findViewById(R.id.loading_pb);
        updatedText = (TextView) findViewById(R.id.updated_text);
    }

    @VisibleForTesting
    public void setViewModel(final HomeViewModel homeViewModel) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                switch (homeViewModel.getCurrentViewState()) {

                    case EMPTY:
                        emptyText.setText(homeViewModel.getEmptyTextResId());
                        emptyText.setVisibility(View.VISIBLE);
                        loadingPb.setVisibility(View.GONE);
                        updatedText.setVisibility(View.GONE);
                        break;
                    case LOADING:
                        emptyText.setVisibility(View.GONE);
                        loadingPb.setVisibility(View.VISIBLE);
                        updatedText.setVisibility(View.GONE);
                        break;
                    case ERROR:
                        emptyText.setVisibility(View.VISIBLE);
                        loadingPb.setVisibility(View.GONE);
                        updatedText.setVisibility(View.GONE);
                        emptyText.setText(homeViewModel.getErrorTextResId());
                        break;
                    case NORMAL:
                        emptyText.setVisibility(View.GONE);
                        loadingPb.setVisibility(View.GONE);
                        updatedText.setVisibility(View.VISIBLE);
                        updatedText.setText(homeViewModel.getUpdatedTextResId());
                        break;
                }

            }
        });
    }
}
