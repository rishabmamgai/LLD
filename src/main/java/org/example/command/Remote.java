package org.example.command;

import lombok.Setter;
import org.example.command.commands.Command;


@Setter
public class Remote {
    private Command command;

    public void pressButton() {
        command.execute();
    }
}
