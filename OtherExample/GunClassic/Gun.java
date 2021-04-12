public abstract class Gun {
    String type = "Default";
    int ammo = 0;
    String material;

    Gun(String material, int ammo){
        this.material = material;
        this.ammo = ammo;
    }

    Gun(){
        this.material = "Wood";
        this.ammo = 10;
    }
    abstract void getName();
    abstract void fire();
    abstract void reload();
    abstract void getAmmo();
}