package org.example.flyweight;

import org.example.flyweight.flyweights.Weapon;
import org.example.flyweight.game.FlyWeightFactory;
import org.example.flyweight.game.GameCharacter;


public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = FlyWeightFactory.getCharacter("AK-74", Weapon.WeaponType.PRIMARY);
        GameCharacter character1 = new GameCharacter(1, 2, weapon1);
        character1.aimAt();

        Weapon weapon2 = FlyWeightFactory.getCharacter("Dragunov", Weapon.WeaponType.PRIMARY);
        GameCharacter character2 = new GameCharacter(4, 6, weapon2);
        character2.aimAt();

        Weapon weapon3 = FlyWeightFactory.getCharacter("Khukri", Weapon.WeaponType.SECONDARY);
        GameCharacter character3 = new GameCharacter(7, 10, weapon3);
        character3.aimAt();

        GameCharacter character4 = new GameCharacter(10, 14, weapon1);
        character4.aimAt();
    }
}
