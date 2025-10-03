package tn.esprit.gestionzoo.entities;

//instruction 5+18
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    //constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    //instruction 18
    //getters
    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isMammal() {
        return isMammal;
    }

    //setters
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("Age doit etre un nombre positif");
        }
        this.age = age;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString(){

        return "Family: "+family+" name: "+name+" age: "+age+" isMammal: "+isMammal;
    }


}
