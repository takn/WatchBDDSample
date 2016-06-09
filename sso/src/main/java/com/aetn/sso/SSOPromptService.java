package com.aetn.sso;

import com.aetn.watch.core.samples.boundaries.sso.ISSOPromptModel;
import com.aetn.watch.core.samples.boundaries.sso.ISSOPromptService;

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
