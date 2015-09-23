package com.agnie.gwt.introjs.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author rajgaurav
 *
 */
public interface Resources extends ClientBundle {
    static final Resources INSTANCE = GWT.create(Resources.class);

    @Source("intro.js")
    TextResource introJs();
}
