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

import com.team10.records.TenantRecord;

public class TenantObject
{
    String Name;
    int AptNum;

    public TenantObject() {
        
    }

    public TenantObject(String Name, int AptNum) {
        this.Name = Name;
        this.AptNum = AptNum;
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

    public String toString() {
        return "Apartment Number: " + AptNum + " Tenant Name: " + Name;
    }
}
