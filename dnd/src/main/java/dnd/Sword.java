package dnd;

import com.opencsv.bean.CsvBindByName;

public class Sword extends Weapon{

    @CsvBindByName(column = "Sharpness")
    int sharpness;
   


    public Sword(int rarity, int damage, int health, String name, int sharpness, String type) {
        super(rarity, name, type, health, damage);
        // TODO Auto-generated constructor stub
        this.sharpness = sharpness;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    public void showSwordInfo(){
        System.out.println("Type: " + this.type + " Rarity: " + this.rarity + " Damage: " + this.damage + " Health: " + this.health + " Name: " + this.name + " Sharpness: " + this.sharpness);
    }

    @Override
    public String toString() {
        return "Sword [damage=" + damage + ", health=" + health + ", name=" + name + ", rarity=" + rarity
                + ", sharpness=" + sharpness + ", type=" + type + "]";
    }

   

    
}