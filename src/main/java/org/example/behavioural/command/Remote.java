package org.example.behavioural.command;

import lombok.Setter;
import org.example.behavioural.command.commands.Command;


@Setter
public class Remote {
    private Command command;

    public void pressButton() {
        command.execute();
    }
}
