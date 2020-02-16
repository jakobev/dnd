package dnd.Controller;

import java.util.ArrayList;

import dnd.Man;
import dnd.Weapon;
import dnd.View.ManView;

public class ManController {

    private Man man;
    private ManView manView;


    public ManController(){
        manView = new ManView();
        man = new Man();
        man.setName(this.manView.getName());
        man.setAge(this.manView.getAge());
        man.setHeight(this.manView.getHeight());
        man.setWeight(this.manView.getWeight());
        manView.setName(this.man.getName());
        manView.setAge(this.man.getAge());
        manView.setHeight(this.man.getHeight());
        manView.setWeight(this.man.getWeight());

        manView.showInfo();
    }
}