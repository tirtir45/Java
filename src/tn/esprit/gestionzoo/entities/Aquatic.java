//instruction 20+22
package tn.esprit.gestionzoo.entities;

//instruction 37
public abstract class Aquatic extends Animal implements Carnivore{
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

    //instruction 24/28
    public abstract void swim();

    //instruction 31
    @Override
    public boolean equals(Object obj){
        if(null==obj){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(obj instanceof Aquatic aquatic){
            return getName().equals(aquatic.getName()) && getAge()==aquatic.getAge() && habitat.equals(aquatic.habitat);
        }
        return false;
    }

    //instruction 37
    public void eatMeat(Food food) {
        if(food.equals(Food.MEAT)){
            System.out.println(this.getName()+" is eating meat");
        }
    }

}

