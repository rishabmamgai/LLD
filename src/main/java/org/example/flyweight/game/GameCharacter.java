package org.example.flyweight.game;

import lombok.AllArgsConstructor;
import org.example.flyweight.flyweights.Weapon;


@AllArgsConstructor
public class GameCharacter {
    private int x;
    private int y;
    private Weapon weapon;

    public void aimAt() {
        weapon.shoot(x, y);
    }
}
