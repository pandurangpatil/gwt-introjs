package com.agnie.gwt.introjs.client;

/**
 * 
 * @author Pandurang Patil
 *
 */
public enum Position {

    BOTTOM("bottom"), TOP("top"), RIGHT("right"), LEFT("left");
    private String value;

    private Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
