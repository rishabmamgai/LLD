package org.example.structural.flyweight.game;

import lombok.AllArgsConstructor;
import org.example.structural.flyweight.flyweights.Weapon;


@AllArgsConstructor
public class GameCharacter {
    private int x;
    private int y;
    private Weapon weapon;

    public void aimAt() {
        weapon.shoot(x, y);
    }
}
