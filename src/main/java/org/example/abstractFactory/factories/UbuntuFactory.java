package org.example.abstractFactory.factories;

import org.example.abstractFactory.kernel.Kernel;
import org.example.abstractFactory.kernel.Linux;
import org.example.abstractFactory.os.OS;
import org.example.abstractFactory.os.Ubuntu;
import org.example.abstractFactory.shell.Bash;
import org.example.abstractFactory.shell.Shell;


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
