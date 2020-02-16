package dnd;

import java.util.ArrayList;

public class Man extends Human{

    int penisLength;
    ArrayList<Weapon> testBag;
    ArrayList<Weapon> weapon;

    public Man(){
        
    }

    public Man(String name, int age, double height, double weight, int life, int loveLevel, int penisLength, ArrayList<Weapon> arrayList) {
        super(name, age, height, weight, life, loveLevel);
        this.penisLength = penisLength;
        // this.testBag = arrayList;
        this.weapon = arrayList;
    }

    /**
     * @return the penisLength
     */
    public int getPenisLength() {
        return penisLength;
    }
   /**
    * @param penisLength the penisLength to set
    */
   public void setPenisLength(int penisLength) {
       this.penisLength = penisLength;
   }
    
   public void showInfo() {
    System.out.println("name = " + this.name + " " + "age = " + this.age + " " + "height = " + this.height + " " + "weight = " + this.weight + " " + "life = " + this.life + " " + "loveLevel = " + this.loveLevel + " " + "penisLength = " + this.penisLength + " " + "Beutelinhalt = " + this.weapon);
}

//Dependency Injection
    public void setWeapons(ArrayList<Weapon> weapons){
        this.weapon = weapons;
    }

}