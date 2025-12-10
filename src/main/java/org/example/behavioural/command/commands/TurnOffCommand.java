package org.example.behavioural.command.commands;

import lombok.AllArgsConstructor;
import org.example.behavioural.command.devices.Device;


@AllArgsConstructor
public class TurnOffCommand implements Command {
    private Device device;

    @Override
    public void execute() {
        device.turnOff();
    }
}
