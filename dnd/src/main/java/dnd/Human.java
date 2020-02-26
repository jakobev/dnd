package dnd;

import com.opencsv.bean.CsvBindByName;

public class Human extends Person {

    @CsvBindByName(column = "Love Level")
    int loveLevel = 100;

    public Human(){
        
    }

    public Human(String name, int age, double height, double weight, int life, int loveLevel) {
        super(name, age, height, weight, life);
        this.loveLevel = loveLevel;
    }

    /**
     * @return the loveLevel
     */
    public int getLoveLevel() {
        return loveLevel;
    }
    /**
     * @param loveLevel the loveLevel to set
     */
    public void setLoveLevel(int loveLevel) {
        this.loveLevel = loveLevel;
    }

    public void showInfo() {
        System.out.println("name = " + this.name + " " + "age = " + this.age + " " + "height = " + this.height + " " + "weight = " + this.weight + " " + "life = " + this.life + " " + "loveLevel = " + this.loveLevel);
    }


}