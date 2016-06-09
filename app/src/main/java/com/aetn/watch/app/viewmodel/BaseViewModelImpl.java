package com.aetn.watch.app.viewmodel;

/**
 * Created by nelsonramirez on 5/17/16.
 */
public class BaseViewModelImpl implements BaseViewModel {

    private VIEWSTATE currentState = VIEWSTATE.EMPTY;

    @Override
    public VIEWSTATE getCurrentViewState() {
        return currentState;
    }

    @Override
    public void setViewState(VIEWSTATE state) {
        this.currentState = state;
    }
}
