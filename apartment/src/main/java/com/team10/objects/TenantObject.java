/**
 * objects/TenantObject.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10.objects;

import java.io.Serializable;

public class TenantObject implements Serializable
{
    String Name;
    int AptNum;
    double[] payment;

    public TenantObject() {
        
    }

    public TenantObject(String Name, int AptNum) {
        this.Name = Name;
        this.AptNum = AptNum;
        payment = new double[13];
        payment[0] = AptNum;
    }

    //Set and Get
    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setAptNumber(int AptNum){
        this.AptNum = AptNum;
    }

    public int getAptNumber(){
        return AptNum;
    }

    public void addPayment(int month, double amount) {
        payment[month] = amount;
    }

    public double[] getPayment() {
        return payment;
    }

    public String toString() {
        return "Apartment Number: " + AptNum + " Tenant Name: " + Name;
    }
}
