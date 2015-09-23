package com.agnie.gwt.introjs.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * @author Pandurang Patil
 *
 */
public class Options extends JavaScriptObject {

    protected Options() {

    }

    /* Next button label in tooltip box */
    public final native void setNextLabel(String label)/*-{
		this.nextLabel = label;
    }-*/;

    public final native String getNextLabel()/*-{
		return this.nextLabel;
    }-*/;

    /* Previous button label in tooltip box */
    public final native void setPrevLabel(String label)/*-{
		this.prevLabel = label;
    }-*/;

    public final native String getPrevLabel()/*-{
		return this.prevLabel;
    }-*/;

    /* Skip button label in tooltip box */
    public final native void setSkipLabel(String label)/*-{
		this.skipLabel = label;
    }-*/;

    public final native String getSkipLabel()/*-{
		return this.skipLabel;
    }-*/;

    /* Done button label in tooltip box */
    public final native void setDoneLabel(String label)/*-{
		this.doneLabel = label;
    }-*/;

    public final native String getDoneLabel()/*-{
		return this.doneLabel;
    }-*/;

    /* Default tooltip box position */
    public final void setTooltipPosition(Position defaultPosition) {
        setTooltipPositionInternal(defaultPosition.getValue());
    }

    public final Position getTooltipPosition() {
        return Position.valueOf(getTooltipPositionInternal());
    }

    private final native void setTooltipPositionInternal(String defaultPosition)/*-{
		this.defaultPosition = label;
    }-*/;

    private final native String getTooltipPositionInternal()/*-{
		return this.defaultPosition;
    }-*/;

    /* Next CSS class for tooltip boxes */
    public final native void setTooltipClass(String tooltipClass)/*-{
		this.tooltipClass = tooltipClass;
    }-*/;

    public final native String getTooltipClass()/*-{
		return this.tooltipClass;
    }-*/;

    /* CSS class that is added to the helperLayer */
    public final native void setHighlightClass(String highlightClass)/*-{
		this.highlightClass = highlightClass;
    }-*/;

    public final native String getHighlightClass()/*-{
		return this.highlightClass;
    }-*/;

    /* Close introduction when pressing Escape button? */
    public final native void setExitOnEsc(boolean exitOnEsc)/*-{
		this.exitOnEsc = exitOnEsc;
    }-*/;

    public final native boolean isExitOnEsc()/*-{
		return this.exitOnEsc;
    }-*/;

    /* Close introduction when clicking on overlay layer? */
    public final native void setExitOnOverlayClick(boolean exitOnOverlayClick)/*-{
		this.exitOnOverlayClick = exitOnOverlayClick;
    }-*/;

    public final native boolean isExitOnOverlayClick()/*-{
		return this.exitOnOverlayClick;
    }-*/;

    /* Show step numbers in introduction? */
    public final native void setShowStepNumbers(boolean showStepNumbers)/*-{
		this.showStepNumbers = showStepNumbers;
    }-*/;

    public final native boolean isShowStepNumbers()/*-{
		return this.showStepNumbers;
    }-*/;

    /* Let user use keyboard to navigate the tour? */
    public final native void setKeyboardNavigation(boolean keyboardNavigation)/*-{
		this.keyboardNavigation = keyboardNavigation;
    }-*/;

    public final native boolean isKeyboardNavigation()/*-{
		return this.keyboardNavigation;
    }-*/;

    /* Show tour control buttons? */
    public final native void setShowButtons(boolean showButtons)/*-{
		this.showButtons = showButtons;
    }-*/;

    public final native boolean isShowButtons()/*-{
		return this.showButtons;
    }-*/;

    /* Show tour bullets? */
    public final native void setShowBullets(boolean showBullets)/*-{
		this.showBullets = showBullets;
    }-*/;

    public final native boolean isShowBullets()/*-{
		return this.showBullets;
    }-*/;

    /* Show tour progress? */
    public final native void setShowProgress(boolean showProgress)/*-{
		this.showProgress = showProgress;
    }-*/;

    public final native boolean isShowProgress()/*-{
		return this.showProgress;
    }-*/;

    /* Scroll to highlighted element? */
    public final native void setScrollToElement(boolean scrollToElement)/*-{
		this.scrollToElement = scrollToElement;
    }-*/;

    public final native boolean isScrollToElement()/*-{
		return this.scrollToElement;
    }-*/;

    /* Set the overlay opacity */
    public final native void setOverlayOpacity(float overlayOpacity)/*-{
		this.overlayOpacity = overlayOpacity;
    }-*/;

    public final native float isOverlayOpacity()/*-{
		return this.overlayOpacity;
    }-*/;

    /* Precedence of positions, when auto is enabled */
    public final void setPositionPrecedence(Position[] positionPrecedence) {
        JsArrayString arr = (JsArrayString) JsArrayString.createArray(positionPrecedence.length);
        for (Position position : positionPrecedence) {
            arr.push(position.getValue());
        }
        setPositionPrecedenceInternal(arr);
    }

    public final Position[] getPositionPrecedence() {
        JsArrayString list = getPositionPrecedenceInternal();
        Position[] pos = new Position[list.length()];
        for (int index = 0; index < list.length(); index++) {
            pos[index] = Position.valueOf(list.get(index));
        }
        return pos;
    }

    private final native void setPositionPrecedenceInternal(JsArrayString positionPrecedence)/*-{
		this.positionPrecedence = positionPrecedence;
    }-*/;

    private final native JsArrayString getPositionPrecedenceInternal()/*-{
		return this.positionPrecedence;
    }-*/;

    /* Disable an interaction with element? */
    public final native void setDisableInteraction(boolean disableInteraction)/*-{
		this.disableInteraction = disableInteraction;
    }-*/;

    public final native boolean isDisableInteraction()/*-{
		return this.disableInteraction;
    }-*/;

    public final native void setSteps(JsArray<Step> steps)/*-{
		this.steps = steps;
    }-*/;

    public final native JsArray<Step> getSteps()/*-{
		return this.steps;
    }-*/;

}
