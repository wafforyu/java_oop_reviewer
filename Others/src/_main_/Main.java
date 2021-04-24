//main package
package _main_;

//import all classes using wildcard
import gun.*;
import player.*;
import static_keyword.Constants;

public class Main {
    public static void main(String[] args) {
        Gun rifle1 = new FullAutomatic();
        Gun rifle2 = new SemiAutomatic("silver", 20, "Guardian", true);

        Player player1 = new Wizard();
        int C = Constants.C;
        float PI = Constants.PI;

        rifle1.getName();
        rifle2.getName();
        player1.getStatus();

        System.out.println(C);
        System.out.println(PI);
    }

}
