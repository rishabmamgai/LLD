package org.example.abstractFactory.shell;


public class PowerShell implements Shell {
    @Override
    public String getShellName() {
        return this.getClass().getSimpleName();
    }
}
