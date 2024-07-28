// Target Interface
interface USBCharger {
    void chargeDevice();
}

class USBBCharger implements USBCharger {
    @Override
    public void chargeDevice() {
        System.out.println("Provide 5W maximum");
    }
}

// Adaptee Class
class USBCCharger {
    public void fastCharge() {
        System.out.println("Provide 10W - 240W");
    }
}

// Adapter Class
class USBCChargerAdapter implements USBCharger {
    private USBCCharger typeCCharger;

    public USBCChargerAdapter(USBCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    @Override
    public void chargeDevice() {
        typeCCharger.fastCharge();
    }
}

// Client Class
class ChargingStation {
    private USBCharger usbCharger;

    public ChargingStation(USBCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    public void charge() {
        usbCharger.chargeDevice();
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        USBCharger typeBCharger = new USBBCharger();
        ChargingStation station = new ChargingStation(typeBCharger);
        station.charge();

        USBCCharger typeCCharger = new USBCCharger();
        USBCharger typeCAdapter = new USBCChargerAdapter(typeCCharger);
        station = new ChargingStation(typeCAdapter);
        station.charge();
    }
}
