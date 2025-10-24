//instruction 20
package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float SwimmingDepth){
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    //getter
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    //setter
    public void setSwimmingDepth(float swimmingDepth) {
        swimmingDepth = swimmingDepth;
    }

    //instruction 23
    @Override
    public String toString(){
        return super.toString()+" Swimming Depth: "+swimmingDepth;
    }

    //instruction 28
    @Override
    public void swim(){
        System.out.println("This Penguin is swimming");
    }
}
