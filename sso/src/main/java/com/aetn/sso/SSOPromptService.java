package com.aetn.sso;

import com.aetn.sso.model.SSOPromptModel;
import com.aetn.watch.core.sso.boundaries.ISSOPromptModel;
import com.aetn.watch.core.sso.boundaries.ISSOPromptService;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class SSOPromptService implements ISSOPromptService {
    public ISSOPromptModel showPrompt() {
        return createPromptModel();
    }

    private ISSOPromptModel createPromptModel() {
        return null;
    }
}
