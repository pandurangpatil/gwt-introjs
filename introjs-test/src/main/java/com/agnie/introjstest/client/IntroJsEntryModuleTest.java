package com.agnie.introjstest.client;

import com.agnie.gwt.introjs.client.AfterChangeEvent;
import com.agnie.gwt.introjs.client.AfterChangeHandler;
import com.agnie.gwt.introjs.client.BeforeChangeEvent;
import com.agnie.gwt.introjs.client.BeforeChangeHandler;
import com.agnie.gwt.introjs.client.ChangeEvent;
import com.agnie.gwt.introjs.client.ChangeHandler;
import com.agnie.gwt.introjs.client.CompleteEvent;
import com.agnie.gwt.introjs.client.CompleteHandler;
import com.agnie.gwt.introjs.client.ExitEvent;
import com.agnie.gwt.introjs.client.ExitHandler;
import com.agnie.gwt.introjs.client.IntroJs;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;

/**
 * @author Pandurang Patil
 *
 */
public class IntroJsEntryModuleTest implements EntryPoint {

    @Override
    public void onModuleLoad() {
        IntroJs instance = new IntroJs();
        instance.start();
        instance.addChangeHandler(new ChangeHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                GWT.log("change event fired...");
            }
        });
        instance.addBeforeChangeHandler(new BeforeChangeHandler() {

            @Override
            public void onBeforeChange(BeforeChangeEvent event) {
                GWT.log("Before change event fired...");
            }
        });
        instance.addAfterChangeHandler(new AfterChangeHandler() {

            @Override
            public void onAfterChange(AfterChangeEvent event) {
                GWT.log("After change event fired...");
            }
        });

        instance.addCompleteHandler(new CompleteHandler() {

            @Override
            public void onComplete(CompleteEvent event) {
                GWT.log("On Complete event fired...");
            }
        });

        instance.addExitHandler(new ExitHandler() {

            @Override
            public void onExit(ExitEvent event) {
                GWT.log("Exit event fired...");
            }
        });
    }
}
