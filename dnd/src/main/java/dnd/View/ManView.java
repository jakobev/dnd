package dnd.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVWriter;

import dnd.Bag;
import dnd.Sword;
import dnd.Weapon;

public class ManView {

    Scanner scanner = new Scanner(System.in);
    // testing, later i will instance an object and pass data
    String name;
    int age;
    double height;
    double weight;
    int life;
    int loveLevel;
    int penisLength;
    ArrayList<Weapon> arrayList;
    String input = "";
    // test weapon
    Sword sword;
    Bag bag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLoveLevel() {
        return loveLevel;
    }

    public void setLoveLevel(int loveLevel) {
        this.loveLevel = loveLevel;
    }

    public int getPenisLength() {
        return penisLength;
    }

    public void setPenisLength(int penisLength) {
        this.penisLength = penisLength;
    }

    public ArrayList<Weapon> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Weapon> arrayList) {
        this.arrayList = arrayList;
    }

    public ManView() throws IOException {
        this.getValues();
    }

    private void getValues() throws IOException {

        

        //TODO
        //validierungen
        
            System.out.println("Wie soll dein Char heißen? Gib einen Namen ein \n und hit Enter");
            this.setName(scanner.nextLine());

            System.out.println("Wie alt ist dein Char? \n Gib eine Zahl ein und hit Enter");
            this.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Wie groß dein Char ? Gib einen Groesse ein \n und hit Enter");
            this.setHeight(Double.valueOf(scanner.nextLine()));

            System.out.println("Wie schwer dein Char ? Gib einen Gewicht ein \n und hit Enter");
            this.setWeight(Double.valueOf(scanner.nextLine()));

            System.out.println("Schwert als Anfangswaffe.....test? J/N");

            input = scanner.nextLine();
            if(input.equals("J")){
                System.out.println("Sie bekommen zum Anfang ein Standardschwert :D hehehe lol opfer");
                Sword sword = new Sword(1, 1, 20, "TestSchwert", 1, "Schwert");
                System.out.println(sword);
                this.setSword(sword);
                bag = new Bag();
                bag.fillBag(sword);
                
            }
            
            


            System.out.println("Ihr Charackter wurde erfolgreich erstellt!");

        }

        public void showInfo(){
        
            System.out.println("Dein Name lautet " + this.getName());
            System.out.println("Dein alter ist " + this.getAge());
            System.out.println("Deine groesse ist " + this.getHeight());
            System.out.println("Dein gewicht ist " + this.getWeight());
            System.out.println("Deine Waffe ist " + this.getSword());

            
        }

        public Sword getSword() {
            return sword;
        }

        public void setSword(Sword sword) {
            this.sword = sword;
        }

       
}