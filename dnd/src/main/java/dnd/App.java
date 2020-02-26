package dnd;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import dnd.Controller.ManController;
import dnd.View.ManView;

/**
 * Hello world!
 *
 */
public class App {

    static String charPath = "dnd\\src\\main\\java\\dnd\\csvTestDB\\createdChar.csv";
    static String weaponPath = "dnd\\src\\main\\java\\dnd\\csvTestDB\\weapon.csv";

    public static void main(String[] args)
            throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

                

        
        

        Scanner scanner = new Scanner(System.in);

        System.out.println( "|---------Hello, welcome to DnD----------|" );
        System.out.println( "|---------What do you want to do?----------|" );
        System.out.println( "|---------Play Game 0----------|" );
        System.out.println( "|---------Create Character 1----------|" );
        System.out.println( "|---------Leave Game 2----------|" );
        System.out.println( "|---------Press the Number and hit Enter----------|" );
        int input = scanner.nextInt();

        if(input == 0){
        System.out.println( "|---------Started Game----------|" );
        //startGame();

        } else if(input == 1){
        System.out.println( "|---------Creating Character----------|" );
        ManController mC = new ManController();
        mC.createChar();
        try (
            
            Writer writer = Files.newBufferedWriter(Paths.get(charPath));
        ) {
            
            StatefulBeanToCsv<Man> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).withSeparator(';')
                    .build();

            List<Man> allMan = mC.getAllMan();
            // myUsers.add(new MyUser("Sundar Pichai ♥", "sundar.pichai@gmail.com", "+1-1111111111", "India"));
            // myUsers.add(new MyUser("Satya Nadella", "satya.nadella@outlook.com", "+1-1111111112", "India"));

            beanToCsv.write(allMan);
        }
        //createChar();

        } else if(input == 2){
        System.out.println( "|---------Shutting Down----------|" );
            //shutDown();
        }
        
        
        scanner.close();

        // Bag Klasseninstanz
        // Bag bag = new Bag();
        // bag.fillBag();

        



       
    }
}
