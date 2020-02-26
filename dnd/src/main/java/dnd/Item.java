package dnd;

import com.opencsv.bean.CsvBindByName;

public class Item{

    @CsvBindByName(column = "Rarity")
    int rarity;
    @CsvBindByName(column = "Name")
    String name;
    @CsvBindByName(column = "Type")
    String type;

    public Item(){

    }


    public Item(int rarity, String name, String type){
        this.rarity = rarity;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", rarity=" + rarity + ", type=" + type + "]";
    }
}