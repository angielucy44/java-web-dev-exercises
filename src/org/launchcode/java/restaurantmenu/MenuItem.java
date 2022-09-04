package org.launchcode.java.restaurantmenu;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;


    public MenuItem (String name, Double price, String description, String category, Boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    public Boolean getIsNew(){
        return isNew;
    }
    public void setIsNew(Boolean isNew){
        this.isNew = isNew;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }


}
