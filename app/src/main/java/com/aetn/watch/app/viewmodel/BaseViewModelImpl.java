package com.aetn.watch.app.viewmodel;

import com.aetn.watch.app.viewmodel.VIEW_STATE;

/**
 * Created by nelsonramirez on 5/17/16.
 */
public class BaseViewModelImpl implements BaseViewModel {

    private VIEW_STATE currentState = VIEW_STATE.EMPTY;

    @Override
    public VIEW_STATE getCurrentViewState() {
        return currentState;
    }

    @Override
    public void setViewState(VIEW_STATE state) {
        this.currentState = state;
    }
}
