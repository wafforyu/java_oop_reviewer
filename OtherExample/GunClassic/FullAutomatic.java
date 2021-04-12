public class FullAutomatic extends Gun{

    String type = "Full-auto";
    String name;

    FullAutomatic(String material, int ammo, String name){
        super(material, ammo);
        this.name = name;
    }

    void getName(){
        System.out.println(this.name);
        System.out.println("This is a full-auto.");
    }

    void fire(){
        this.ammo -= 3;
    }

    void reload(){
        this.ammo = 50;
    }

    void getAmmo(){
        System.out.print(this.ammo);
    }
}