package com.agnie.gwt.introjs.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class CompleteEvent extends GwtEvent<CompleteHandler> {

    public static Type<CompleteHandler> TYPE = new Type<CompleteHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<CompleteHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(CompleteHandler handler) {
        handler.onComplete(this);
    }

}
