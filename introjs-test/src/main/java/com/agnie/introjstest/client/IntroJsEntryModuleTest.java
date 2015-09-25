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
import com.agnie.gwt.introjs.client.Options;
import com.agnie.gwt.introjs.client.Step;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author Pandurang Patil
 *
 */
public class IntroJsEntryModuleTest implements EntryPoint {

    @Override
    public void onModuleLoad() {
        HTMLPanel panel = new HTMLPanel("Dynamic Content Second Step");
        panel.addStyleName("second");
        RootPanel.get().add(panel);

        IntroJs instance = new IntroJs();
        Options opts = (Options) Options.createObject();
        JsArray<Step> steps = (JsArray<Step>) JsArray.createArray();
        Step step = (Step) Step.createObject();
        step.setIntro("First intro message");
        step.setTargetElementQuerySelector(".first");
        steps.push(step);
        step = (Step) Step.createObject();
        step.setIntro("Second intro message");
        step.setTargetElementQuerySelector(".second");
        steps.push(step);
        step = (Step) Step.createObject();
        step.setIntro("Third intro message");
        step.setTargetElementQuerySelector("#third");
        steps.push(step);
        opts.setSteps(steps);

        instance.setOptions(opts);
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
