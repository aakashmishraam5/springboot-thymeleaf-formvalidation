package com.akash.springdemo.mvc;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    private String FirstName;
    @NotNull(message = "required")
    @Size(min =1 , message = "required")
    private String LastName= "";


    public int getFreePass() {
        return FreePass;
    }

    public void setFreePass(int FreePass) {
        this.FreePass = FreePass;
    }
@Min(value = 1 ,message = "must be greater than this")
@Max(value = 10,message = "must be less than this")
    private int FreePass;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
}
