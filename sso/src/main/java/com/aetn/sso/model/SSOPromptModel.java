package com.aetn.sso.model;

import com.aetn.watch.core.DataProvider;
import com.aetn.watch.core.sso.boundaries.ISSOPromptModel;

import java.util.ArrayList;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class SSOPromptModel implements ISSOPromptModel {
    private ArrayList<String> benefitsList= new ArrayList<>();

    //TODO Inject later
    private DataProvider dataProvider;

    public SSOPromptModel(DataProvider dataProvider){
        this.dataProvider = dataProvider;
    };

    public ArrayList<String> getBenefitsList() {
        return benefitsList;
    }
}
