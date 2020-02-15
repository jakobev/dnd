package dnd;

import java.util.ArrayList;

//Bag is an Main Game Item so its not vererbt eheheheeheheheeheh Peter Griffin 
public class Bag{
    ArrayList<Weapon> weaponBag = new ArrayList<Weapon>();

    //Test Weapon
    Weapon wp = new Weapon(60, 50, 100);


    //method to add new weapon to bag lol :D
    /**
     * 
     * @return ArrayList<Weapon>
     */
    public ArrayList<Weapon> fillBag(){
        weaponBag.add(wp);
        System.out.println("Bag Klasse in fillBag method " + wp);
        return weaponBag;
    }
  
/**
 * @return the weaponBag
 */
public ArrayList<Weapon> getWeaponBag() {
    return weaponBag;
}


}