// 1. Base Class
class Device {
    String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println(brand + " device is powering on.");
    }
}

// 2. Single Inheritance (Child class extends Device)
class SmartDevice extends Device {
    public SmartDevice(String brand) {
        super(brand);
    }

    public void connectToWiFi() {
        System.out.println(brand + " smart device connected to Wi-Fi.");
    }
}

// Interfaces for Multiple capabilities
interface VoiceAssistant {
    void listenToVoice();
}

interface Rechargeable {
    void checkBatteryLevel();
}

// 3. Hybrid Inheritance Class:
// Extends SmartDevice (Single Inheritance) AND implements VoiceAssistant & Rechargeable (Multiple via Interfaces)
class SmartSpeaker extends SmartDevice implements VoiceAssistant, Rechargeable {

    public SmartSpeaker(String brand) {
        super(brand);
    }

    @Override
    public void listenToVoice() {
        System.out.println(brand + " smart speaker is listening for voice commands...");
    }

    @Override
    public void checkBatteryLevel() {
        System.out.println(brand + " smart speaker battery level is at 85%.");
    }
}

public class HybridInterface {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker("EchoTech");

        speaker.powerOn();          // Inherited from Device (Grandparent)
        speaker.connectToWiFi();    // Inherited from SmartDevice (Parent)
        speaker.listenToVoice();    // Implemented from VoiceAssistant interface
        speaker.checkBatteryLevel();// Implemented from Rechargeable interface
    }
}