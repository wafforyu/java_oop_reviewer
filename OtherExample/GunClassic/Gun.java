public abstract class Gun {
    String type = "Default";
    int ammo = 0;
    String material;

    Gun(String material, int ammo){
        this.material = material;
        this.ammo = ammo;
    }

    abstract void fire();
    abstract void reload();
    abstract void getAmmo();
}