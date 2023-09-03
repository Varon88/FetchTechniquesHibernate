package org.example;

import jakarta.persistence.Embeddable;


public class ExtendedNames {

    private String FName;
    private String LName;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    @Override
    public String toString() {
        return "ExtendedNames{" +
                "FName='" + FName + '\'' +
                ", LName='" + LName + '\'' +
                '}';
    }
}
