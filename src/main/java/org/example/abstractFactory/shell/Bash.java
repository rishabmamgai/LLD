package org.example.abstractFactory.shell;


public class Bash implements Shell {
    @Override
    public String getShellName() {
        return this.getClass().getSimpleName();
    }
}
