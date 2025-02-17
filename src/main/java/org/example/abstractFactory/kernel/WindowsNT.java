package org.example.abstractFactory.kernel;


public class WindowsNT implements Kernel {
    @Override
    public String getKernelName() {
        return this.getClass().getSimpleName();
    }
}
