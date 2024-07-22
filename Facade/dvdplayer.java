
package Facade;
// Facade - class for DVD Player

public class dvdplayer {
    public void on() {
        System.out.println("DVD Player is on");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping DVD Player");
    }

    public void off() {
        System.out.println("DVD Player is off");
    }
}

