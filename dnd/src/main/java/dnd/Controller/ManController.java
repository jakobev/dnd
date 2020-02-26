package dnd.Controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import dnd.Man;
import dnd.Weapon;
import dnd.View.ManView;

public class ManController {

    private Man man;
    private ManView manView;
    private List<Man> mList = new ArrayList<>();


    // public ManController() throws IOException,
    // CsvDataTypeMismatchException,
    // CsvRequiredFieldEmptyException {

       
       
     public void createChar() throws IOException,
     CsvDataTypeMismatchException,
     CsvRequiredFieldEmptyException{

         manView = new ManView();
         man = new Man();
         man.setName(this.manView.getName());
         man.setAge(this.manView.getAge());
         man.setHeight(this.manView.getHeight());
         man.setWeight(this.manView.getWeight());
         man.setSingleWeapon(this.manView.getSword());
         manView.setName(this.man.getName());
         manView.setAge(this.man.getAge());
         manView.setHeight(this.man.getHeight());
         manView.setWeight(this.man.getWeight());
         manView.setSword(this.man.getSingleWeapon());
         mList.add(man);
         
         manView.showInfo();
        }
    // }

    public List<Man> getAllMan(){
        return mList;
    }
}