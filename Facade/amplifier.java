
package Facade;

public class amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}
