import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //instruction 1
        /*int nbrCages=20;
        String zooName="my zoo";
        System.out.println("Nombres de cages: " + nbrCages + " Nom du zoo: " + zooName);
        */
        //instruction 2
        Scanner input = new Scanner(System.in); //helps w reading data
        int nbrCages;
        do {
            System.out.print("donner nombres de cages: ");
            nbrCages = input.nextInt();
        } while (nbrCages < 0);

        input.nextLine(); //for enter issue

        String zooName;
        do {
            System.out.print(" donner nom du zoo: ");
            zooName = input.nextLine();
        } while (zooName.equals(""));

        //instruction 3
        System.out.print(zooName + " comporte " + nbrCages + " cages");

    }
}

