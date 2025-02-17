package org.example.abstractFactory.factories;

import org.example.abstractFactory.kernel.Kernel;
import org.example.abstractFactory.os.OS;
import org.example.abstractFactory.shell.Shell;


public interface OSAbstractFactory {
    OS getOS();
    Shell getShell();
    Kernel getKernel();
}
