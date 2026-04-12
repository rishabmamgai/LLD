package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.kernel.Kernel;
import org.example.creational.abstractFactory.os.OS;
import org.example.creational.abstractFactory.shell.Shell;


public interface OSAbstractFactory {
    OS getOS();
    Shell getShell();
    Kernel getKernel();
}
