import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //instruction 5
        Animal lion=new Animal("Asadet","Asad",18,true);
        Zoo myZoo=new Zoo("hadikethayawanet","ariana",10);

        System.out.println("Family: "+lion.family +" Name: "+lion.name +" Age: "+lion.age+" isMammal: "+lion.isMammal);
        //System.out.println("Name: "+myZoo.name +" city: "+myZoo.city +" NbrCages: "+myZoo.nbrCages );
        //instruction 8+9
        myZoo.displayZoo();
        System.out.println(myZoo); //prints Zoo@27d6c5e0
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());


    }
}