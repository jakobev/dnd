package dnd;

import com.opencsv.bean.CsvBindByName;

public class Weapon extends Item{

    @CsvBindByName(column = "Damage")
    int damage = 0;
    @CsvBindByName(column = "Health")
    int health = 100;
    
    public Weapon(int rarity, String name, String type, int damage, int health){
        super(rarity, name, type);
        this.damage = damage;
        this.health = health;
    }

    public Weapon(){

    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }
    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }


    public void showWeaponStats(){
        System.out.println("Name: " + this.name + " " + "Damage: " + this.damage + " " + "Health: " + this.health);
    }

    @Override
    public String toString() {
        return "Weapon [damage=" + damage + ", health=" + health + ", name=" + name + ", rarity=" + rarity + ", type="
                + type + "]";
    }

   
    

   

    
    
    
}

