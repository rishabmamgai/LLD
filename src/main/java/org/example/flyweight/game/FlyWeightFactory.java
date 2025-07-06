package org.example.flyweight.game;

import org.example.flyweight.flyweights.PrimaryWeapon;
import org.example.flyweight.flyweights.SecondaryWeapon;
import org.example.flyweight.flyweights.Weapon;
import org.example.flyweight.flyweights.Weapon.WeaponType;

import java.util.HashMap;


public class FlyWeightFactory {
    private static final HashMap<String, Weapon> inventory = new HashMap<>();

    public static Weapon getCharacter(String name, Weapon.WeaponType type) {
        Weapon weapon = inventory.getOrDefault(name, null);

        if (weapon == null) {
            if (type == WeaponType.PRIMARY) {
                Sprite sprite = new Sprite();
                weapon = new PrimaryWeapon(name, type, sprite);
            }

            else if (type == WeaponType.SECONDARY) {
                Sprite sprite = new Sprite();
                weapon = new SecondaryWeapon(name, type, sprite);
            }

            inventory.put(name, weapon);
        }

        return weapon;
    }
}
