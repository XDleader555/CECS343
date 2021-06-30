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

import com.team10.SaveObject;
import com.team10.objects.TenantObject;

public class TenantRecord
{   
    ArrayList<TenantObject> tenantRecord;
    
    public TenantRecord() {
        // Import data
        tenantRecord = (ArrayList<TenantObject>) SaveObject.ImportObject("tenantrecord.o");

        if(tenantRecord == null) {
            tenantRecord = new ArrayList<TenantObject>();
            SaveObject.ExportObject(tenantRecord, "tenantrecord.o");
        }
    }

    public ArrayList<TenantObject> getRecord() {
        return tenantRecord;
    }

    public void addTenant(TenantObject t) {
        tenantRecord.add(t);

        // Flush saves to file right away
        SaveObject.ExportObject(tenantRecord, "tenantrecord.o");
    }

    public TenantObject getTenant(int aptNum) {
        for(int i = 0; i < tenantRecord.size(); i++) {
            if (tenantRecord.get(i).getAptNumber() == aptNum) {
                return tenantRecord.get(i);
            }
        }
        return null;
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
        String[] columns = {"Apt. No", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        System.out.println(Arrays.toString(columns));
        
        for(int i = 0; i < tenantRecord.size(); i++) {
            System.out.println(Arrays.toString(tenantRecord.get(i).getPayment()));
        }
    }
}
