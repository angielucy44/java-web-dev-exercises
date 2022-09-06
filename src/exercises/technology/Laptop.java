package exercises.technology;

public class Laptop extends Computer {

    //variables
    private boolean hasNumberKeypad;

    //constructor
    public Laptop(double screenSize, double batteryLife, boolean hasTouchscreen, int brightnessLevel,boolean hasNumberKeypad, int id) {
        super(screenSize, batteryLife, hasTouchscreen, brightnessLevel, id);
        this.hasNumberKeypad = hasNumberKeypad;
    }
    //methods
    public boolean Numbers() {
        if (hasNumberKeypad == true) {
            return true;
        }
        return false;
    }

        public boolean getHasNumberKeypad() {
            return hasNumberKeypad;

        }
    }


