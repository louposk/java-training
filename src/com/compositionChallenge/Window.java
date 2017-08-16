package com.compositionChallenge;

import java.util.List;

/**
 * Created by kloupos on 09/01/2017.
 */
public class Window {
    private int number;
    private String position;
    private String colour;
    private WindowDimensions windowDimensions;
    private List opendedWindows;

    public Window(int number, String position, String colour, WindowDimensions windowDimensions) {
        this.number = number;
        this.position = position;
        this.colour = colour;
        this.windowDimensions = windowDimensions;
        this.opendedWindows = null;
    }

    public void openWindow(String position) {
        System.out.println("Opening " + position + " window.");
//        this.opendedWindows.add(position);
//        System.out.println(this.getOpendedWindows());
    }

    public void closeWindow(String position) {
        System.out.println("Closing " + position + " window.");
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getColour() {
        return colour;
    }

    public WindowDimensions getWindowDimensions() {
        return windowDimensions;
    }

    public List getOpendedWindows() {
        return opendedWindows;
    }
}
