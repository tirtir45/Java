//instruction 20
package tn.esprit.gestionzoo.entities;

//instruction 37
public abstract class Terrestrial extends Animal implements Omnivore {
    private int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    //getter
    public int getNbrLegs() {
        return nbrLegs;
    }

    //setter
    public void setNbrLegs(int nbrLegs) {
        nbrLegs = nbrLegs;
    }

    //instruction 37
    public void eatPlantandMeat(Food food){
        if(food.equals(Food.BOTH)){
            System.out.println(this.getName()+" is eating both meat and plant");
        }
    }

}