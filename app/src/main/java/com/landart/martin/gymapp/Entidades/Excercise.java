package com.landart.martin.gymapp.Entidades;


/**
 * Created by martin on 08/04/17.
 */

public abstract class Excercise {
    private int id;
    private String name;
    private String descriptionShort;
    private String descriptionLong;
    private Category[] categories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }
}
