package com.aetn.watch.ui;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.aetn.watch.UiTestHarnessActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Uses a test harness activity to instantiate screens for ui testing
 * Created by nelsonramirez on 5/17/16.
 */
@RunWith(AndroidJUnit4.class)
public class BaseUiTest extends AndroidTestCase {

    @Rule
    public ActivityTestRule<UiTestHarnessActivity> mActivityRule =
            new ActivityTestRule<UiTestHarnessActivity>(UiTestHarnessActivity.class, true, true);


    @Before
    public void setup() {
        while (getActivity() == null) {
            //wait for the activity to wake the eff up
        }
    }

    @Test
    public void correctSetup() {
        assertTrue(getActivity() instanceof UiTestHarnessActivity);
    }

    protected UiTestHarnessActivity getActivity() {
        if (mActivityRule == null) {
            return null;
        }
        return mActivityRule.getActivity();
    }

}
