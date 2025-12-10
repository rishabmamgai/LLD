package org.example.behavioural.command;

import org.example.behavioural.command.commands.Command;
import org.example.behavioural.command.commands.TurnOffCommand;
import org.example.behavioural.command.commands.TurnOnCommand;
import org.example.behavioural.command.devices.Ac;
import org.example.behavioural.command.devices.Tv;


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
