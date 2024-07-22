
package Facade;

import Facade.dvdplayer;
import Facade.amplifier;
import Facade.hometheater;
import Facade.projector;
import Facade.screen;

// Facade design pattern main class

public class facadedp {
    public static void main(String[] args) {
        // Create instances of subsystem components
        dvdplayer dvdPlayer = new dvdplayer();
        amplifier amplifier = new amplifier();
        projector projector = new projector();
        screen screen = new screen();

        // Create the facade
        hometheater homeTheater = new hometheater(dvdPlayer, amplifier, projector, screen);

        // Use the facade to control the subsystem
        homeTheater.watchMovie("Avengers: The Endgame");
        homeTheater.endMovie();
    }
}

