/**
 * objects/PaymentObject.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10.objects;

import com.team10.records.PaymentRecord;

public class PaymentObject
{
    int TenantID;
    int Month;
    int Year;
    Double PaymentAmount;

    public PaymentObject() {
        
    }

    public PaymentObject(int TenantID, int Month, int Year, Double PaymentAmount){
        this.TenantID = TenantID;
        this.Month = Month;
        this.Year = Year;
        this.PaymentAmount = PaymentAmount;
    }
}
