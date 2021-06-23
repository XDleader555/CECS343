/**
 * records/PaymentRecord.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10.records;
import java.util.ArrayList;

import com.team10.objects.PaymentObject;
import com.team10.records.RecordParent;

public class PaymentRecord extends RecordParent
{   
    ArrayList<PaymentObject> paymentRecord;
    
    public PaymentRecord() {
        paymentRecord = new ArrayList<PaymentObject>();
    }

    public ArrayList getRecord() {
        return paymentRecord;
    }

    public void addPayment(PaymentObject p) {
        paymentRecord.add(p);
    }

    public void displayRecord() {
        for(int i = 0; i < paymentRecord.size(); i++) {
            System.out.println(paymentRecord.get(i));
        }
    }
}
