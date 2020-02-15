package dnd;



public class Unhuman extends Person{

    int surviveDuration = 100;

    public Unhuman(String name, int age, double height, double weight, int life, int surviveDuration) {
        super(name, age, height, weight, life);
        this.surviveDuration = surviveDuration;
    }

    /**
     * @return the surviveDuration
     */
    public int getSurviveDuration() {
        return surviveDuration;
    }
    /**
     * @param surviveDuration the surviveDuration to set
     */
    public void setSurviveDuration(int surviveDuration){
        this.surviveDuration = surviveDuration;
    }
   
}