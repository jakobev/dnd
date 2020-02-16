package dnd;


public class Item{

    int rarity;
    String name;


    public Item(int rarity, String name){
        this.rarity = rarity;
        this.name = name;
    }

    /**
     * @return the rarity
     */
    public int getRarity() {
        return rarity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}