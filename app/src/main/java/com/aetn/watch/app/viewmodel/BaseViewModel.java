package com.aetn.watch.app.viewmodel;

/**
 * Created by nelsonramirez on 5/17/16.
 */
public interface BaseViewModel {
    VIEWSTATE getCurrentViewState();

    void setViewState(VIEWSTATE state);
}
