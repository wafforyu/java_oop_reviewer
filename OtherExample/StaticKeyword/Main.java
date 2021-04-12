package java_oop_reviewer.GunPackage.StaticKeyword;

public class Main{
    public static void main(String[] args) {
        
        Gun.fire();
        Gun.fire();
        Gun.fire();
        Gun.fire();
        Gun.fire();
        System.out.println(Gun.getAmmo());
        Gun.reload();
        System.out.println(Gun.getAmmo());

        Gun gun1 = new Gun();
        gun1.fire();
        System.out.println(gun1.getAmmo());

    }
}