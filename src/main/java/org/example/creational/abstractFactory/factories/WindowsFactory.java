package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.kernel.Kernel;
import org.example.creational.abstractFactory.kernel.WindowsNT;
import org.example.creational.abstractFactory.os.OS;
import org.example.creational.abstractFactory.os.Windows;
import org.example.creational.abstractFactory.shell.PowerShell;
import org.example.creational.abstractFactory.shell.Shell;


public class WindowsFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Windows();
    }

    @Override
    public Shell getShell() {
        return new PowerShell();
    }

    @Override
    public Kernel getKernel() {
        return new WindowsNT();
    }
}
