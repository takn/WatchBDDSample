package com.aetn.watch.ui;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;

import com.aetn.watch.R;
import com.aetn.watch.app.viewmodel.VIEWSTATE;
import com.aetn.watch.home.HomeViewModel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by nelsonramirez on 5/17/16.
 * Shows a POC of testing a view's ui based on the viewmodel's state
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeScreenUiTest extends BaseUiTest {

    @Test
    public void viewDisplaysCorrectEmptyState() {
        HomeViewModel homeViewModel = new HomeViewModel();
        Assert.assertEquals("emptyState", VIEWSTATE.EMPTY, homeViewModel.getCurrentViewState());
        getActivity().setViewModel(homeViewModel);
        String emptyText = getActivity().getString(R.string.home_empty);
        onView(withId(R.id.empty_text)).check(matches(withText(emptyText)));
        onView(withId(R.id.loading_pb)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
        onView(withId(R.id.updated_text)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));

        //you can do layout matchers to test for common mistakes.. make sure views display completely,
        //or that they are laid out properly or that they are not overlapping
        //see the different matchers available under android.support.test.espresso.matcher
        //to get an idea of what things you can test for
    }

    @Test
    public void viewDisplaysCorrectLoadingState() {
        HomeViewModel homeViewModel = new HomeViewModel();
        homeViewModel.setViewState(VIEWSTATE.LOADING);
        Assert.assertEquals("loadingState", VIEWSTATE.LOADING, homeViewModel.getCurrentViewState());
        getActivity().setViewModel(homeViewModel);
        onView(withId(R.id.loading_pb)).check(matches(isDisplayed()));

        onView(withId(R.id.empty_text)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
        onView(withId(R.id.updated_text)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
    }

    @Test
    public void viewDisplaysCorrectErrorState() {
        HomeViewModel homeViewModel = new HomeViewModel();
        homeViewModel.setViewState(VIEWSTATE.ERROR);
        Assert.assertEquals("errorState", VIEWSTATE.ERROR, homeViewModel.getCurrentViewState());
        getActivity().setViewModel(homeViewModel);
        onView(withId(R.id.empty_text)).check(matches(isDisplayed()));

        String errorText = getActivity().getString(R.string.error_state);
        onView(withId(R.id.empty_text)).check(matches(withText(errorText)));

        onView(withId(R.id.loading_pb)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
        onView(withId(R.id.updated_text)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
    }

    @Test
    public void viewDisplaysCorrectNormalState() {
        HomeViewModel homeViewModel = new HomeViewModel();
        homeViewModel.setViewState(VIEWSTATE.NORMAL);
        Assert.assertEquals("normal state", VIEWSTATE.NORMAL, homeViewModel.getCurrentViewState());
        getActivity().setViewModel(homeViewModel);
        onView(withId(R.id.updated_text)).check(matches(isDisplayed()));

        String updatedText = getActivity().getString(R.string.updated_text);
        onView(withId(R.id.updated_text)).check(matches(withText(updatedText)));

        onView(withId(R.id.empty_text)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
        onView(withId(R.id.loading_pb)).check(matches(withEffectiveVisibility(
                ViewMatchers.Visibility.GONE)));
    }


    private void addViewForTesting(View view) {
        getActivity().addContentView(view, null);
    }


//    public void setModelForCurrentView(HomeViewModel modelForCurrentView) {
//        getActivity().setModelForCurrentView(modelForCurrentView);
//    }
}
