package dnd;


public class Collectable extends Item{

    String art = "";

    public Collectable(int rarity, String art, String name) {
        super(rarity, name);
        this.art = art;
    }


}