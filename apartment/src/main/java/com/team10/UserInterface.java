/**
 * UserInterface.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10;

import com.team10.objects.ExpenseObject;
import com.team10.objects.LoginObject;
import com.team10.objects.PaymentObject;
import com.team10.objects.TenantObject;
import com.team10.records.TenantRecord;

import java.util.ArrayList;
import java.util.Scanner;

import com.team10.AnnualReport;

public class UserInterface
{
    TenantRecord tenantRecord = new TenantRecord();

    public UserInterface() {
        
    }

    public void userInputExpense() {

    }

    public void userInputPayment() {

    }

    public void userInputTenant() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input the tenant name: ");
        String name = scan.nextLine();

        System.out.println("Please input the tenant apartment number: ");
        int aptNum = scan.nextInt();

        System.out.println("Please input the tenant ID: ");
        int id = scan.nextInt();

        TenantObject t = new TenantObject(name, aptNum, id);
        tenantRecord.addTenant(t);
    }

    public void displayTenantRecord() {
        tenantRecord.displayRecord();
    }
}
