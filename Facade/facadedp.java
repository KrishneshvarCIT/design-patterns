
package Facade;

public class facadedp {
    public static void main(String[] args) {

        dvdplayer dvdPlayer = new dvdplayer();
        amplifier amplifier = new amplifier();
        projector projector = new projector();
        screen screen = new screen();

        hometheater homeTheater = new hometheater(dvdPlayer, amplifier, projector, screen);

        homeTheater.watchMovie("Avengers: The Endgame");
        homeTheater.endMovie();
    }
}
