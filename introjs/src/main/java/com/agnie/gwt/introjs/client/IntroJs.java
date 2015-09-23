package com.agnie.gwt.introjs.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class IntroJs {

    private JavaScriptObject introJsInstance;
    private EventBus         eventBus = new SimpleEventBus();

    public IntroJs() {
        introJsInstance = exportOnHandlers(this);
    }

    private static native JavaScriptObject exportOnHandlers(IntroJs introjs)/*-{
		var instance = $wnd.introJs();
		instance.oncomplete(function() {
			introjs.@com.agnie.gwt.introjs.client.IntroJs::completeFire()();
		});

		instance.onexit(function() {
			introjs.@com.agnie.gwt.introjs.client.IntroJs::exitFire()();
		});

		instance
				.onchange(function(targetElement) {
					introjs.@com.agnie.gwt.introjs.client.IntroJs::changeFire(Lcom/google/gwt/core/client/JavaScriptObject;)(targetElement);
				});
		instance
				.onbeforechange(function(targetElement) {
					introjs.@com.agnie.gwt.introjs.client.IntroJs::beforeChangeFire(Lcom/google/gwt/core/client/JavaScriptObject;)(targetElement);
				});
		instance
				.onafterchange(function(targetElement) {
					introjs.@com.agnie.gwt.introjs.client.IntroJs::afterChangeFire(Lcom/google/gwt/core/client/JavaScriptObject;)(targetElement);
				});
		return instance;
    }-*/;

    final void afterChangeFire(JavaScriptObject targetElement) {
        eventBus.fireEvent(new AfterChangeEvent((Element) targetElement));
    }

    final void beforeChangeFire(JavaScriptObject targetElement) {
        eventBus.fireEvent(new BeforeChangeEvent((Element) targetElement));
    }

    final void changeFire(JavaScriptObject targetElement) {
        eventBus.fireEvent(new ChangeEvent((Element) targetElement));
    }

    final void exitFire() {
        eventBus.fireEvent(new ExitEvent());
    }

    final void completeFire() {
        eventBus.fireEvent(new CompleteEvent());
    }

    /**
     * Given callback function will be called after starting a new step of introduction. The callback function receives
     * the element of the new step as an argument.
     * 
     * @param handler
     * @return
     */
    public HandlerRegistration addAfterChangeHandler(AfterChangeHandler handler) {
        return eventBus.addHandler(AfterChangeEvent.TYPE, handler);
    }

    /**
     * Given callback function will be called before starting a new step of introduction. The callback function receives
     * the element of the new step as an argument.
     * 
     * @param handler
     * @return
     */
    public HandlerRegistration addBeforeChangeHandler(BeforeChangeHandler handler) {
        return eventBus.addHandler(BeforeChangeEvent.TYPE, handler);
    }

    /**
     * Set callback to change of each step of introduction. Given callback function will be called after completing each
     * step. The callback function receives the element of the new step as an argument.
     * 
     * @param handler
     * @return
     */
    public HandlerRegistration addChangeHandler(ChangeHandler handler) {
        return eventBus.addHandler(ChangeEvent.TYPE, handler);
    }

    /**
     * Set callback to exit of introduction. Exit also means pressing ESC key and clicking on the overlay layer by the
     * user.
     * 
     * @param handler
     * @return
     */
    public HandlerRegistration addExitHandler(ExitHandler handler) {
        return eventBus.addHandler(ExitEvent.TYPE, handler);
    }

    /**
     * Set callback for when introduction completed.
     * 
     * @param handler
     * @return
     */
    public HandlerRegistration addCompleteHandler(CompleteHandler handler) {
        return eventBus.addHandler(CompleteEvent.TYPE, handler);
    }

    /**
     * Start the introduction for defined element(s).
     * 
     * @return
     */
    public IntroJs start() {
        start(introJsInstance);
        return this;
    }

    private final static native void start(JavaScriptObject instance)/*-{
		instance.start();
    }-*/;

    /**
     * Go to specific step of introduction.
     * 
     * @param stepIndex
     *            Step index
     * @return
     */
    public IntroJs goToStep(int stepIndex) {
        goToStep(introJsInstance, stepIndex);
        return this;
    }

    private final static native void goToStep(JavaScriptObject instance, int stepIndex)/*-{
		instance.goToStep(stepIndex);
    }-*/;

    /**
     * Go to next step of introduction.
     * 
     * @return
     */
    public IntroJs nextStep() {
        nextStep(introJsInstance);
        return this;
    }

    private final static native void nextStep(JavaScriptObject instance)/*-{
		instance.nextStep();
    }-*/;

    /**
     * Go to previous step of introduction.
     * 
     * @return
     */
    public IntroJs previousStep() {
        previousStep(introJsInstance);
        return this;
    }

    private final static native void previousStep(JavaScriptObject instance)/*-{
		instance.previousStep();
    }-*/;

    /**
     * Exit the introduction.
     * 
     * @return
     */
    public IntroJs exit() {
        exit(introJsInstance);
        return this;
    }

    private final static native void exit(JavaScriptObject instance)/*-{
		instance.exit();
    }-*/;

    /**
     * Set a group of options to the introJs object. It will merge the options.
     * 
     * @param options
     */
    public IntroJs setOptions(Options options) {
        setOptions(introJsInstance, options);
        return this;
    }

    private final static native void setOptions(JavaScriptObject instance, Options options)/*-{
		instance.setOptions(options);
    }-*/;

    /**
     * To refresh and order layers manually
     */
    public IntroJs refresh() {
        refresh(introJsInstance);
        return this;
    }

    private final static native void refresh(JavaScriptObject instance)/*-{
		instance.refresh();
    }-*/;
}
