package com.agnie.gwt.introjs.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * @author Pandurang Patil
 *
 */
public class Step extends JavaScriptObject {
    protected Step() {
    }

    public final native void setIntro(String intro)/*-{
		this.intro = intro;
    }-*/;

    public final native String getIntro()/*-{
		return this.intro;
    }-*/;

    public final void setPosition(Position position) {
        setPositionInternal(position.getValue());
    }

    public final Position getPosition() {
        return Position.valueOf(getPositionInternal());
    }

    private final native void setPositionInternal(String position)/*-{
		this.position = position;
    }-*/;

    private final native String getPositionInternal()/*-{
		return this.position;
    }-*/;

    public final native void setTargetElementQuerySelector(String targetElementQuerySelector)/*-{
		this.element = targetElementQuerySelector;
    }-*/;

    public final native String getTargetElementQuerySelector()/*-{
		return this.element;
    }-*/;

    public final native void setTargetElement(Element targetElement)/*-{
		this.element = targetElement;
    }-*/;

    public final native Element getTargetElement()/*-{
		return this.element;
    }-*/;
}
