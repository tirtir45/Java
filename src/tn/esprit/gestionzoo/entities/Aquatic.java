//instruction 20+22
package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    private String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    //getter
    public String getHabitat() {
        return habitat;
    }

    //setter
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //instruction 23
    @Override
    public String toString(){
        return super.toString()+" habitat: "+habitat;
    }

    //instruction 24
    public void swim(){
        System.out.println("This aquatic is swimming");
    }
}