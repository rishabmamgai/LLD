package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.kernel.Kernel;
import org.example.creational.abstractFactory.kernel.Linux;
import org.example.creational.abstractFactory.os.OS;
import org.example.creational.abstractFactory.os.Ubuntu;
import org.example.creational.abstractFactory.shell.Bash;
import org.example.creational.abstractFactory.shell.Shell;


public class UbuntuFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Ubuntu();
    }

    @Override
    public Shell getShell() {
        return new Bash();
    }

    @Override
    public Kernel getKernel() {
        return new Linux();
    }
}
