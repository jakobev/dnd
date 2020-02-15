package dnd;


public class Weapon extends Item{

    int damage = 0;
    int health = 100;

    public Weapon(int rarity, int damage, int health) {
        super(rarity);
        this.damage = damage;
        this.health = health;
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
        System.out.println("Damage: " + this.damage + " " + "Health: " + this.health);
    }

    @Override
    public String toString() {
        return "weapon Klasse: this is da weapon";
    }

    
    
    
}

