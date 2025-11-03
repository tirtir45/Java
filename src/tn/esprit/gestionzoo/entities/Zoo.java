package tn.esprit.gestionzoo.entities;

import tn.esprit.ZooFullException.InvalidAgeException;
import tn.esprit.ZooFullException.ZooFullExpception;

//instruction 5 + 6 + 18
public class Zoo {
    Animal[] animals;
    private String name;
    private String city;
    //instruction 14
    public static final int nbrCages=3;//changed from 25 for testing
    private int nbrAnimals;
    //instruction 25
    Aquatic[] aquaticAnimals;
    private int nbAquatic;

    //constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages]; //always in constructor
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
        //instruction 25
        this.aquaticAnimals = new Aquatic[10];
        this.nbAquatic =0;
    }
    //instruction 18
    //getters
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public int getNbrAnimals(){
        return nbrAnimals;
    }

    //setters
    public void setName(String name){
        if(name.trim().isEmpty()) {
            System.out.println("nom ne doit pas une chaine vide");
        }
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setNbrAnimals(int nbrAnimals){
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NbrCages: "+nbrCages);
    }

    @Override
    public String toString(){

        return "Name: "+name+" City: "+city+" NbrCages: "+nbrCages;
    }

    //instruction 10 + 32 + 33 +34
    public void addAnimal(Animal animal) throws ZooFullExpception, InvalidAgeException {
            //instruction 12+17
            /*if(this.searchAnimal(animal)!=-1 || isZoofull()){
                return false;
            }*/
        //instruction 33
        if(isZoofull()){
            throw new ZooFullExpception("zoo full");
        }

        //instruction 34
        if(animal.getAge()<0){
            throw new InvalidAgeException("animal cannot have a negative age!");
        }

            this.animals[nbrAnimals] = animal;
            nbrAnimals++;
            //return true;
    }

    //instruction 11
    public void displayAnimals(){
        for (int i=0;i<animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    //instruction 18
    public int searchAnimal(Animal animal){
        for (int i=0;i<animals.length;i++){
            if(animals[i] !=null && animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }

    //instruction 13
    public boolean removeAnimal(Animal animal) {
        int i = this.searchAnimal(animal);
        if (i != -1) {
            this.animals[i] = null;
            nbrAnimals--;
            for(int j=i+1;j<nbrAnimals && this.nbrAnimals <= nbrCages;j++){
                this.animals[j] = this.animals[j+1];
                return true;
            }
        }
        return false;
    }

    //instruction 15
    public boolean isZoofull(){

        return nbrAnimals>=nbrCages;
    }

    //instruction 16
    public Zoo comparerZoo(Zoo z1 , Zoo z2){

        if(z1.nbrAnimals>z2.nbrAnimals){
            System.out.println("le tn.esprit.gestionzoo.entities.Zoo:" + z1.name +" a plus d'animaux");
            return z1;
        } else if (z2.nbrAnimals> z1.nbrAnimals) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo:" + z2.name +" a plus d'animaux");
            return z2;
        }else{
            System.out.println("les zoos ont le meme nombre d'animaux");
            return null;
        }
    }

    //instruction 26
    public void addAquaticAnimal(Aquatic aquatic){

        if(nbAquatic<aquaticAnimals.length){
            aquaticAnimals[nbAquatic] = aquatic;
            nbAquatic++;
            System.out.println("ajout avec success");
        }else{
            System.out.println("plein");
        }
    }

    //instruction 30
    public void displayNumberOfAquaticsByType(){

        int dof=0;
        int pen=0;

        for(int i=0;i<aquaticAnimals.length;i++){
            Aquatic aquatic = aquaticAnimals[i];
            if(aquatic instanceof Dolphin){
                dof++;
            }else if (aquatic instanceof Penguin){
                pen++;
            }
        }
        System.out.println("Nombre des dauphins:" +dof);
        System.out.println("Nombre des pengouins:" +pen);
    }

}


