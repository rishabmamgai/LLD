package org.example.command;

import org.example.command.commands.Command;
import org.example.command.commands.TurnOffCommand;
import org.example.command.commands.TurnOnCommand;
import org.example.command.devices.Ac;
import org.example.command.devices.Tv;


public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();

        Command turnOnCommand = new TurnOnCommand(new Tv());
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        Command turnOffCommand = new TurnOffCommand(new Ac());
        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
}
