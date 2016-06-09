package com.aetn.sso.model;

import com.aetn.watch.core.DataProvider;
import com.aetn.watch.core.samples.boundaries.sso.ISSOPromptModel;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class SSOPromptModelTest {
    @Mock
    DataProvider dataProvider;

    private ISSOPromptModel ssoPromptModel;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
//        Mockito.when(dataProvider);
        ssoPromptModel = new SSOPromptModel(dataProvider);
    }

    @Test
    public void testGetBenefitsList() throws Exception {
        assertNotNull(ssoPromptModel.getBenefitsList());
    }
}