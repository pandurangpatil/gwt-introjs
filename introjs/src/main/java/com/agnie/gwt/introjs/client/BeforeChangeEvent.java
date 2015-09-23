package com.agnie.gwt.introjs.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class BeforeChangeEvent extends GwtEvent<BeforeChangeHandler> {

    private Element targetElement;

    public BeforeChangeEvent(Element targetElement) {
        this.targetElement = targetElement;
    }

    public Element getTargetElement() {
        return targetElement;
    }

    public static Type<BeforeChangeHandler> TYPE = new Type<BeforeChangeHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<BeforeChangeHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(BeforeChangeHandler handler) {
        handler.onBeforeChange(this);
    }

}
