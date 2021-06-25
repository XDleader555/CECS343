/**
 * records/TenantRecord.java
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
import java.util.Arrays;

import com.team10.objects.TenantObject;
import com.team10.records.RecordParent;

public class TenantRecord extends RecordParent
{   
    ArrayList<TenantObject> tenantRecord;
    
    public TenantRecord() {
        tenantRecord = new ArrayList<TenantObject>();
    }

    public ArrayList getRecord() {
        return tenantRecord;
    }

    public void addTenant(TenantObject t) {
        tenantRecord.add(t);
    }

    public TenantObject getTenant(int aptNum) {
        for(int i = 0; i < tenantRecord.size(); i++) {
            if (tenantRecord.get(i).getAptNumber() == aptNum) {
                return tenantRecord.get(i);
            }
        }
        return tenantRecord.get(0);
    }

    public double calculatePaymentSum() {
        double sum = 0;
        for(int i = 0; i < tenantRecord.size(); i++) {
            double[] payment = tenantRecord.get(i).getPayment();
            for (int j = 1; j < payment.length; j++) {
                sum += payment[j];
            }
        }
        return sum;
    }

    public void displayTenantRecord() {
        for(int i = 0; i < tenantRecord.size(); i++) {
            System.out.println(tenantRecord.get(i));
        }
    }

    public void displayPaymentRecord() {
        for(int i = 0; i < tenantRecord.size(); i++) {
            System.out.println(Arrays.toString(tenantRecord.get(i).getPayment()));
        }
    }
}
