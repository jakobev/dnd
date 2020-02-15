package dnd;


public class Woman extends Human{

    double breastWidth;

    public Woman(String name, int age, double height, double weight, int life, int loveLevel, double breastWidth) {
        super(name, age, height, weight, life, loveLevel);
        this.breastWidth = breastWidth;
    }

    /**
     * @return the breastWidth
     */
    public double getBreastWidth() {
        return breastWidth;
    }

    /**
     * @param breastWidth the breastWidth to set
     */
    public void setBreastWidth(double breastWidth) {
        this.breastWidth = breastWidth;
    }
    public void showInfo() {
        System.out.println("name = " + this.name + " " + "age = " + this.age + " " + "height = " + this.height + " " + "weight = " + this.weight + " " + "life = " + this.life + " " + "loveLevel = " + this.loveLevel + " " + "breastWidth = " + this.breastWidth);
    }

}