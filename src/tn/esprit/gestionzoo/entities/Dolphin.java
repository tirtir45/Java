//instruction 20
package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    //getter
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    //setter
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    //instruction 23
    @Override
    public String toString(){
        return super.toString()+" Swimming Speed: "+swimmingSpeed;
    }

    //instruction 24/28
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming");
    }

}