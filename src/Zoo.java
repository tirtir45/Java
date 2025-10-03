//instruction 5 + 6
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

        //constructeur
    Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25]; //always in constructor we make the initialization of the table
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    void displayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NbrCages: "+nbrCages);
    }

    void displayAnimals(){

    }

    @Override//redefinition
    public String toString(){

        return "Name: "+name+" City: "+city+" NbrCages: "+nbrCages;
    }
}


