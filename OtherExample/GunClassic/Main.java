public class Main{
    public static void main(String[] args) {
        Gun gun2 = new FullAutomatic("wood", 40, "AR-15");
        Gun gun3 = new SemiAutomatic("iron", 20, "Guardian",true);

        gun3.fire();
        gun3.getAmmo();

        gun2.fire();
        gun2.getAmmo();
    }
}