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
    int AptNum;
    int Month;
    double PaymentAmount;

    public PaymentObject() {
        
    }

    public PaymentObject(int AptNum, int Month, double PaymentAmount){
        this.AptNum = AptNum;
        this.Month = Month;
        this.PaymentAmount = PaymentAmount;
    }

    public int getAptNum() {
        return AptNum;
    }
}
