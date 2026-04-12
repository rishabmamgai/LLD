package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.kernel.Kernel;
import org.example.creational.abstractFactory.os.OS;
import org.example.creational.abstractFactory.shell.Shell;

import java.util.Objects;


public class OSFactory {
    private final OSAbstractFactory osAbstractFactory;

    public OSFactory() {
        String env = System.getProperty("env");

        if (Objects.equals(env, "win")) {
            this.osAbstractFactory = new WindowsFactory();
        }
        else if (Objects.equals(env, "deb")) {
            this.osAbstractFactory = new UbuntuFactory();
        }
        else {
            throw new RuntimeException("Factory not available for specified env.");
        }
    }

    public OS getOS() {
        // Some logic before object instantiation.
        return osAbstractFactory.getOS();
    }

    public Shell getShell() {
        // Some logic before object instantiation.
        return osAbstractFactory.getShell();
    }

    public Kernel getKernel() {
        // Some logic before object instantiation.
        return osAbstractFactory.getKernel();
    }
}
