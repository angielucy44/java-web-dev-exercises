package exercises.technology;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Program {

    Computer myComputer;

    @Before
    public void createMyComputer() {
        myComputer = new Computer(10, 12, true, 15, 4);
    }

    Laptop myLaptop;

    @Before
    public void createMyLaptop() {
        myLaptop = new Laptop(8, 10, false, 20, true, 6);
    }

    SmartPhone mySmartPhone;

    @Before
    public void createMySmartPhone() {
        mySmartPhone = new SmartPhone(5, 8, true, 25, null, 9);

    }

    @Test
    public void computerTestReturnsTrue() {
        myComputer.increaseBrightnessLevel();
        assertEquals(16, myComputer.getBrightnessLevel());
    }

    @Test
    public void laptopTestReturnsTrue() {
//        myLaptop.Numbers();
        assertTrue(myLaptop.getHasNumberKeypad());
    }

    @Test
    public void smartPhoneTestReturnsTrue() {
        assertTrue(myLaptop.get)
    }

}

