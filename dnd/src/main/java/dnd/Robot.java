package dnd;



public class Robot extends Unhuman{

    double fuelLevel = 100;

    public Robot(String name, int age, double height, double weight, int life, int surviveDuration, double fuelLevel) {
        super(name, age, height, weight, life, surviveDuration);
        this.fuelLevel = fuelLevel;
    }
    /**
     * @return the fuelLevel
     */
    public double getFuelLevel() {
        return fuelLevel;
    }
    /**
     * @param fuelLevel fuelLevel to set
     */
    public void setFuelLevel(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    public void showInfo() {
        System.out.println("name = " + this.name + " " + "age = " + this.age + " " + "height = " + this.height + " " + "weight = " + this.weight + " " + "life = " + this.life + " " + "surviveDuration = " + this.surviveDuration + " " + "FuelLevel = " + this.fuelLevel);
    }

   

   

}