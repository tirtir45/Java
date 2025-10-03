package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //instruction 5
        Animal lion=new Animal("Asadet","Asad",18,true);
        Animal zarafa=new Animal("zizi","zouzo",50,true);
        Animal me3za=new Animal("mooo","meee",10,true);
        Animal bata=new Animal("batout","bata",18,false);
        Animal kalb=new Animal("haba","kalbouch",15,true);
        Animal katous=  new Animal("kat","kat",20,true);

        Zoo myZoo=new Zoo("hadikethayawanet","ariana",10);
        //instruction 16
        Zoo tonZoo=new Zoo("meow","marsa",20);



        //System.out.println("Family: "+lion.family +" Name: "+lion.name +" Age: "+lion.age+" isMammal: "+lion.isMammal);
        //System.out.println("Name: "+myZoo.name +" city: "+myZoo.city +" NbrCages: "+myZoo.nbrCages );
        //instruction 8+9
        //myZoo.displayZoo();
       //System.out.println(myZoo); //prints tn.esprit.gestionzoo.entities.Zoo@27d6c5e0
        //System.out.println(myZoo.toString());

        //System.out.println(lion);
        System.out.println(lion.toString());

        //insctruction 10
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(zarafa));
        System.out.println(myZoo.addAnimal(me3za));
        System.out.println(myZoo.addAnimal(bata));

        //instruction 11
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));

        //instrtruction 13
        myZoo.removeAnimal(me3za);
        myZoo.displayAnimals();

        //instruction 15
        if(myZoo.isZoofull()){
            System.out.println("zoo complet");
        }else{
            System.out.println("zoo mrgl");
        }

        //instruction 16
        tonZoo.addAnimal(kalb);
        tonZoo.addAnimal(zarafa);
        tonZoo.addAnimal(me3za);
        tonZoo.addAnimal(bata);
        tonZoo.addAnimal(katous);
        tonZoo.displayAnimals();
        Zoo superZoo=myZoo.comparerZoo(myZoo,tonZoo);

    }
}