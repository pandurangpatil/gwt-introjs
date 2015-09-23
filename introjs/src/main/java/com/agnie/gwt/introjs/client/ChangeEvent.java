package com.agnie.gwt.introjs.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class ChangeEvent extends GwtEvent<ChangeHandler> {

    private Element targetElement;

    public ChangeEvent(Element targetElement) {
        this.targetElement = targetElement;
    }

    public Element getTargetElement() {
        return targetElement;
    }

    public static Type<ChangeHandler> TYPE = new Type<ChangeHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ChangeHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ChangeHandler handler) {
        handler.onChange(this);
    }

}
