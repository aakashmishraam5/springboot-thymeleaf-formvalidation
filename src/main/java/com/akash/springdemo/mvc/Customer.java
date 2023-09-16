package com.akash.springdemo.mvc;

import jakarta.validation.constraints.*;

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


    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Pattern(regexp ="^[a-zA-Z0-9]{5}" ,message = "only 5 char/digits")
    private String PostalCode;

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
