
package Facade;

public class dvdplayer {
    public void on() {
        System.out.println("DVD Player is on");
    }

    public void play(String movie) {
        System.out.println("\nPlaying movie: " + movie + "\n");
    }

    public void stop() {
        System.out.println("Stopping DVD Player");
    }

    public void off() {
        System.out.println("DVD Player is off");
    }
}
