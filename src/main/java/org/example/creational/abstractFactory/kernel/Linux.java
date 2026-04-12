package org.example.creational.abstractFactory.kernel;


public class Linux implements Kernel {
    @Override
    public String getKernelName() {
        return this.getClass().getSimpleName();
    }
}
