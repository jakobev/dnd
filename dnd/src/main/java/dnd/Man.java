package dnd;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvBindByName;
import java.io.FileReader;

public class Man extends Human {

    @CsvBindByName(column = "Penis Length")
    int penisLength;
    ArrayList<Weapon> testBag;
    ArrayList<Weapon> weapon;
    //testing weapon
    @CsvBindByName(column = "Weapon")
    Sword singleWeapon;
    Bag bag;

     
  


    public Man(){
        
    }

    public Man(String name, int age, double height, double weight, int life, int loveLevel, int penisLength, ArrayList<Weapon> arrayList, Sword singleWeapon, Bag bag) {
        super(name, age, height, weight, life, loveLevel);
        this.penisLength = penisLength;
        // this.testBag = arrayList;
        this.weapon = arrayList;
        this.singleWeapon = singleWeapon;
        this.bag = bag;
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

    public Sword getSingleWeapon() {
        return singleWeapon;
    }

    public void setSingleWeapon(Sword singleWeapon) {
        this.singleWeapon = singleWeapon;
    }

}