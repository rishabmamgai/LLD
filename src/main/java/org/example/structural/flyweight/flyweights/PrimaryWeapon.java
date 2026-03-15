package org.example.structural.flyweight.flyweights;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.structural.flyweight.game.Sprite;


@Getter
@AllArgsConstructor
public class PrimaryWeapon implements Weapon {
    private String name;
    private WeaponType type;
    private Sprite bitMap;

    @Override
    public void shoot(int x, int y) {

    }
}
