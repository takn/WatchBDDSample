package com.aetn.sso.model;

import com.aetn.watch.core.DataProvider;
import com.aetn.watch.core.samples.boundaries.sso.ISSOPromptModel;

import java.util.ArrayList;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class SSOPromptModel implements ISSOPromptModel {
    private ArrayList<String> benefitsList = new ArrayList<>();
    //TODO Inject later
    DataProvider dataProvider;

    public SSOPromptModel(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public DataProvider getDataProvider() {
        return dataProvider;
    }

    public void setDataProvider(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public ArrayList<String> getBenefitsList() {
        return benefitsList;
    }
}
