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
    public TenantObject() {
        
    }

    //Set and Get
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }

    public void setAptNumber(int AptNumber){
        this.AptNumber = AptNumber;
    }
    public int getAptNumber(){
        return AptNumber;
    }

    public void setTenantID(int TenantID){
        this.TenantID = TenantID;
    }
    public int getTanantID(){
        return TanantID;
    }
}
