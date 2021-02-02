package com.platzi.market.domain;

public class Category {
    private int cateforyID;
    private String category;
    private boolean active;

    public int getCateforyID() {
        return cateforyID;
    }

    public void setCateforyID(int cateforyID) {
        this.cateforyID = cateforyID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
