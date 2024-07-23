
package Facade;

public class hometheater {
    private dvdplayer dvdPlayer;
    private amplifier amplifier;
    private projector projector;
    private screen screen;

    public hometheater(dvdplayer dvdPlayer, amplifier amplifier, projector projector, screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
    }
}
