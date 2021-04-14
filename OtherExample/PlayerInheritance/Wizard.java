public class Wizard extends Player {
    int Level;
    int intelligence = 10;
    
    Wizard(){
        super();
    }
    Wizard(String username){
        super(username);
        super.role = "Wizard";
    }
    Wizard(String username, String email){
        super(username,email);
        super.role = "Wizard";
    }
    Wizard(String username, String email, int Level){
        super(username,email);
        this.Level = Level;
    }

    public void getStatus(){
        super.getStatus();
        System.out.println(role);
    }
}
