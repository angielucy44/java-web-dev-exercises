package exercises.technology;

public class Computer extends AbstractEntity {
    ///Variables
    private double screenSize;
    private double batteryLife;
    private boolean hasTouchScreen;

    private int brightnessLevel;

    //Constructor
    public Computer(double screenSize, double batteryLife, boolean hasTouchScreen, int brightnessLevel, int id){
        super(id);
       this.screenSize = screenSize;
       this.batteryLife = batteryLife;
        this.hasTouchScreen = hasTouchScreen;
        this.brightnessLevel = brightnessLevel;

    }

    //Methods
    public void increaseBrightnessLevel() {
        this.brightnessLevel = brightnessLevel + 1;
    }
    public void makeNoise() {
        System.out.println("You've got mail.");
    }
    public int getBrightnessLevel() {
        return brightnessLevel;
    }
}
