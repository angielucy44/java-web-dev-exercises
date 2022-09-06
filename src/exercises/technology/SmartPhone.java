package exercises.technology;

public class SmartPhone extends Computer{
    //Variables
    private String password;


    //Constructor
    public SmartPhone(double screenSize, double batteryLife, boolean hasTouchScreen, int brightnessLevel, String password, int id) {
        super(screenSize, batteryLife, hasTouchScreen, brightnessLevel, id);
    }

    //Methods
    public void requirePassword() {
        if(password == null){
            System.out.println("Type your password.");
        }
    }
    public void getScreenSize() {
        return screenSize;
    }

}
