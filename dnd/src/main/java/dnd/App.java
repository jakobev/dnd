package dnd;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Bag bag = new Bag();
        System.out.println( "Hello World!" );
        System.out.println("wp weapon " + bag.wp.toString());
        bag.fillBag();
        System.out.println( bag.toString());
        System.out.println( bag.getWeaponBag());
        System.out.println("weapon bag " + bag.weaponBag.toString());

        //Test Person class
        System.out.println("Person class test");
        Person gandalf = new Person("Gandalf", 398, 1.99, 88.5, 100);
        Person frodo = new Person("Frodo", 25, 1.34, 30.0, 100);



        //Test Robot class
        System.out.println("Robot class test");
        Robot wally = new Robot("Wall-E", 4930, 0.50, 10, 100, 100, 100);

        //Test Man class
        System.out.println("Man class test");
        Man testMan = new Man("Marv", 27, 1.83, 75, 100, 100, 18, bag.getWeaponBag());


        //Test Woman class
        System.out.println("Woman class test");
        Woman vanessa = new Woman("vanessa", 23, 1.58, 60, 100, 100, 93);



        //Person
        gandalf.showInfo();
        frodo.showInfo(); //Person

        //Robot
        wally.showInfo();

        //Human Man
        testMan.showInfo();

        //Human Woman
        vanessa.showInfo();
    }
}
