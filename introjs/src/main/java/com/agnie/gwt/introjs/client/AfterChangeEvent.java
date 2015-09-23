package com.agnie.gwt.introjs.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class AfterChangeEvent extends GwtEvent<AfterChangeHandler> {

    private Element targetElement;

    public AfterChangeEvent(Element targetElement) {
        this.targetElement = targetElement;
    }

    public Element getTargetElement() {
        return targetElement;
    }

    public static Type<AfterChangeHandler> TYPE = new Type<AfterChangeHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<AfterChangeHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(AfterChangeHandler handler) {
        handler.onAfterChange(this);
    }

}
