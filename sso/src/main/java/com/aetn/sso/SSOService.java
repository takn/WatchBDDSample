package com.aetn.sso;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class SSOService {
    private boolean isLoggedIn;

    public SSOService(boolean isLoggedIn) {

        this.isLoggedIn = isLoggedIn;
    }

    public SSOService() {

    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean shouldShowDialog() {
        return !isLoggedIn;
    }
}
