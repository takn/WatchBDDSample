package com.aetn.watch.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.aetn.watch.app.viewmodel.BaseViewModel;

/**
 * Created by nelsonramirez on 5/20/16.
 */
public class StatefulBaseView extends FrameLayout {
    public StatefulBaseView(Context context) {
        super(context);
    }

    public StatefulBaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StatefulBaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onViewModelUpdate(BaseViewModel baseViewModel) {

    }
}
