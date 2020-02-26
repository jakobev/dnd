package dnd;

import java.util.ArrayList;

//Bag is an Main Game Item so its not vererbt eheheheeheheheeheh Peter Griffin 
public class Bag{
    ArrayList<Weapon> weaponBag = new ArrayList<Weapon>();

    //Test Weapon
    // Weapon wp = new Weapon(100, 60, 50, "Todesschlitzer");
    //this.weaponBag.add(wp);


    //method to add new weapon to bag lol :D
    /**
     * 
     * @return ArrayList<Weapon>
     */
    public void fillBag(Sword wp){
        weaponBag.add(wp);
        // System.out.println("Bag Klasse in fillBag method " + wp);
    }
    
  
/**
 * @return the weaponBag
 */
public ArrayList<Weapon> getWeaponBagWeapons() {
    for (Weapon weapon : this.weaponBag){
        System.out.println("getWeaponBag Method " + weapon);

    }
    return weaponBag;
}


}