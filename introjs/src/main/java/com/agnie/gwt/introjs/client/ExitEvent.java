package com.agnie.gwt.introjs.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil
 *
 */
public class ExitEvent extends GwtEvent<ExitHandler> {

    public static Type<ExitHandler> TYPE = new Type<ExitHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ExitHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ExitHandler handler) {
        handler.onExit(this);
    }

}
