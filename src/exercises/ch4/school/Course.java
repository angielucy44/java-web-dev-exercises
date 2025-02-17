package exercises.ch4.school;

import java.util.ArrayList;

public class Course {
    private String name;

    private ArrayList<Student> students;

    private int worthNumberOfCredits;

    public Course(String name, int numberOfCredits){
        this.name = name;
        this.worthNumberOfCredits = numberOfCredits;
    }


    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)) {return true;
        }
        else {
            return false;
            }
    }
    }

