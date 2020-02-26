package dnd;


public class Collectable extends Item{

    String art = "";

    public Collectable(int rarity, String art, String name, String type) {
        super(rarity, name, type);
        this.art = art;
    }


}