package java_oop_reviewer.GunPackage.StaticKeyword;

public class Gun {

    static int ammo = 10;

    static void fire(){
        ammo -= 1;
        System.out.println("Bang");
    }

    static void reload(){
        ammo = 10;
        System.out.println("reload ammo");
    }

    static int getAmmo(){
        return ammo;
    }

}