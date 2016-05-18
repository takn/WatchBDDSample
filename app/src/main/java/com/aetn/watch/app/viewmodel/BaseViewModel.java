package com.aetn.watch.app.viewmodel;

/**
 * Created by nelsonramirez on 5/17/16.
 */
public interface BaseViewModel {
    VIEW_STATE getCurrentViewState();

    void setViewState(VIEW_STATE state);
}
