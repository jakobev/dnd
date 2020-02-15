package dnd;


public class Collectable extends Item{

    String art = "";

    public Collectable(int rarity, String art) {
        super(rarity);
        this.art = art;
    }


}