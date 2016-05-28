package com.aetn.watch.home;

import com.aetn.watch.R;
import com.aetn.watch.app.viewmodel.BaseViewModelImpl;

/**
 * Created by nelsonramirez on 5/17/16.
 */
public class HomeViewModel extends BaseViewModelImpl {


    public int getEmptyTextResId() {
        return R.string.home_empty;
    }

    public int getUpdatedTextResId() {
        return R.string.updated_text;
    }

    public int getErrorTextResId() {
        return R.string.error_state;
    }
}
