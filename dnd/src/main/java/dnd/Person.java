package dnd;

import com.opencsv.bean.CsvBindByName;

public class Person {

    @CsvBindByName(column = "Name")
    String name;
    @CsvBindByName(column = "Age")
    int age;
    @CsvBindByName(column = "Height")
    double height;
    @CsvBindByName(column = "weight")
    double weight;
    @CsvBindByName(column = "Life")
    int life;

    public Person(){
        
    }

    public Person(String name, int age, double height, double weight, int life){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.life = life;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public int getLife(){
        return this.life;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setLife(int life){
        this.life = life;
    }
    public void showInfo(){
        System.out.println("name = " + this.name + " " + "age = " + this.age + " " + "height = " + this.height + " " + "weight = " + this.weight + " " + "life = " + this.life);
    }
}