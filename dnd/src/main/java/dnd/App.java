package dnd;

import java.util.Scanner;

import dnd.Controller.ManController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

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
        //createChar();

        } else if(input == 2){
        System.out.println( "|---------Shutting Down----------|" );
            //shutDown();
        }
        
        
        scanner.close();

        // Bag Klasseninstanz
        Bag bag = new Bag();
        bag.fillBag();

        



        //Test Robot class
        // System.out.println("Robot class test");
        // Robot wally = new Robot("Wall-E", 4930, 0.50, 10, 100, 100, 100);

        //Test Man class
        // System.out.println("Man class test");
        // Man testMan = new Man("Marv", 27, 1.83, 75, 100, 100, 18, bag.getWeaponBagWeapons());


        //Test Woman class
        // System.out.println("Woman class test");
        // Woman vanessa = new Woman("vanessa", 23, 1.58, 60, 100, 100, 93);




        //Robot
        // wally.showInfo();

        //Human Man
        // testMan.showInfo();

        //Human Woman
        // vanessa.showInfo();
    }
}
