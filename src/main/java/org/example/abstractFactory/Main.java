package org.example.abstractFactory;

import org.example.abstractFactory.factories.OSFactory;


public class Main {
    public static void main(String[] args) {
        System.out.println("\nSetting windows environment...");
        System.setProperty("env", "win");

        OSFactory osFactoryWindows = new OSFactory();
        System.out.println(osFactoryWindows.getOS().getOSName());
        System.out.println(osFactoryWindows.getShell().getShellName());
        System.out.println(osFactoryWindows.getKernel().getKernelName());

        System.out.println("\nSetting ubuntu environment...");
        System.setProperty("env", "deb");

        OSFactory osFactoryUbuntu = new OSFactory();
        System.out.println(osFactoryUbuntu.getOS().getOSName());
        System.out.println(osFactoryUbuntu.getShell().getShellName());
        System.out.println(osFactoryUbuntu.getKernel().getKernelName());
    }
}
