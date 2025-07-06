package org.example.flyweight.flyweights;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.flyweight.game.Sprite;


@Getter
@AllArgsConstructor
public class SecondaryWeapon implements Weapon {
    private String name;
    private WeaponType type;
    private Sprite bitMap;

    @Override
    public void shoot(int x, int y) {

    }
}
