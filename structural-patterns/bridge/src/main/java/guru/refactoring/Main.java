package guru.refactoring;

import guru.refactoring.devices.Device;
import guru.refactoring.devices.Radio;
import guru.refactoring.devices.TV;
import guru.refactoring.remotes.AdvancedRemote;
import guru.refactoring.remotes.BasicRemote;

/**
 * Client
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}