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
    int TenantID;

    public TenantObject() {
        
    }

    public TenantObject(String Name, int AptNum, int TenantID) {
        this.Name = Name;
        this.AptNum = AptNum;
        this.TenantID = TenantID;
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

    public void setTenantID(int TenantID){
        this.TenantID = TenantID;
    }

    public int getTenantID(){
        return TenantID;
    }

    public String toString() {
        return "Tenant Name: " + Name + " Apartment Number: " + AptNum + " Tenant ID: " + TenantID;
    }
}
