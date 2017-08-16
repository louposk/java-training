package com.compositionChallenge;

/**
 * Created by kloupos on 09/01/2017.
 */
public class Room {
    private Window theWindow;
    private Door theDoor;

    public Room(Window theWindow, Door theDoor) {
        this.theWindow = theWindow;
        this.theDoor = theDoor;
    }

    public void openWindow(String name) {
        theWindow.openWindow("Left");
    }

//    Window window = new Window(2,"Left","Black",new WindowDimensions(200,500));
//        window.openWindow("Left");
}
