package org.example.flyweight.flyweights;


public interface Weapon {
    void shoot(int x, int y);

    enum WeaponType {
        PRIMARY, SECONDARY;
    }
}
