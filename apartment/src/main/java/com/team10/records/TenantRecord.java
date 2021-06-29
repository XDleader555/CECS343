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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import com.team10.objects.TenantObject;

public class TenantRecord
{   
    ArrayList<TenantObject> tenantRecord;
    
    public TenantRecord() {
        tenantRecord = new ArrayList<TenantObject>();
    }

    public ArrayList<TenantObject> getRecord() {
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
        for(int i = 0; i < tenantRecord.size(); i++) {
            System.out.println(Arrays.toString(tenantRecord.get(i).getPayment()));
        }
    }

    File file = new File("ListOfTenants.txt");
    public void TenantWriter() throws FileNotFoundException, IOException{
        PrintWriter pw = new PrintWriter(new FileOutputStream(file));
        FileOutputStream fo = new FileOutputStream(file);
        for(int i = 0; i < tenantRecord.size(); i++) {
            pw.write(tenantRecord.get(i).toString());
        }
        pw.close();
        fo.close();
    }

    
    public void TenantReader() throws FileNotFoundException{
        try {
            BufferedReader BuffReader = new BufferedReader(new FileReader("ListOfTenants.txt"));
            String line = BuffReader.readLine();
            while(line != null){
                line = BuffReader.readLine();
            }
            BuffReader.close();
            
        } catch (Exception e) {
            System.out.println("File Not Found");
        }

    }

}
