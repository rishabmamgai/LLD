package org.example.abstractFactory.factories;

import org.example.abstractFactory.kernel.Kernel;
import org.example.abstractFactory.kernel.WindowsNT;
import org.example.abstractFactory.os.OS;
import org.example.abstractFactory.os.Windows;
import org.example.abstractFactory.shell.PowerShell;
import org.example.abstractFactory.shell.Shell;


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
