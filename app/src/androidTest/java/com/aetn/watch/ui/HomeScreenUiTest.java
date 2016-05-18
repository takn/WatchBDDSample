package com.aetn.watch.ui;

import android.support.test.espresso.Espresso;
import android.support.test.runner.AndroidJUnit4;

import com.aetn.watch.app.viewmodel.VIEW_STATE;
import com.aetn.watch.home.HomeViewModel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by nelsonramirez on 5/17/16.
 */
@RunWith(AndroidJUnit4.class)
public class HomeScreenUiTest extends BaseUiTest {

    @Test
    public void viewDisplaysCorrectEmptyState() {
        HomeViewModel homeViewModel = new HomeViewModel();
        Assert.assertEquals("emptyState", VIEW_STATE.EMPTY, homeViewModel.getCurrentViewState());
        addViewForTesting(new HomeView(getContext()));

//        Espresso.onView(withText(homeViewModel.get))
    }

    private void addViewForTesting(HomeView homeView) {
        getActivity().addContentView(homeView, null);
    }


}
