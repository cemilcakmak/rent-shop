package com.springframework.rentshop.model;

public class Customer extends Person {

    private int creditPoint;

    public int getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(int creditPoint) {
        this.creditPoint = creditPoint;
    }
}
