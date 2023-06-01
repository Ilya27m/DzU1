import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Steel steel = new Steel();
        Sword<Steel> sword = new Sword(steel);
        System.out.println(sword.checkEndurance());
        Sword<Plastic> sword2 = new Sword(Plastic);
    }
}