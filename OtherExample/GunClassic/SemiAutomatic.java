public class SemiAutomatic extends FullAutomatic{
    
    boolean isScope;

    SemiAutomatic(String material, int ammo, String name, boolean isScope){
        super(material, ammo, name);
        this.isScope = isScope;
    }

    void getName(){
        super.getName();
        System.out.println("This is a semi-auto");
    }

    void getAmmo(){
        System.out.println(this.ammo);
    }

    void fire(){
        this.ammo -= 2;
    }
    
    void reload(){
        this.ammo = 20;
    }
}