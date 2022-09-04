package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Integer> gradesGiven = new ArrayList<>();
    private double pointsWorth;

    public Course (String courseName, ArrayList<Integer> gradesGiven, double pointsWorth){
        this.courseName = courseName;
        this.gradesGiven = gradesGiven;
        this.pointsWorth = pointsWorth;

    }
}
