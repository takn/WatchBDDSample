package com.aetn.sso.model;

import com.aetn.watch.core.DataProvider;

import java.util.ArrayList;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class SSOPromptModel {
    private ArrayList<String> benefitsList= new ArrayList<>();
    private DataProvider dataProvider;

    public SSOPromptModel(DataProvider dataProvider){

        this.dataProvider = dataProvider;
    };

    public ArrayList<String> getBenefitsList() {
        return benefitsList;
    }
}
