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
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the tenant apartment number: ");
        int aptNum = scan.nextInt();

        System.out.println("Input the month of the payment: ");
        int month = scan.nextInt();

        System.out.println("Input the amount paid: ");
        double amount = scan.nextDouble();

        TenantObject ten = tenantRecord.getTenant(aptNum);
        ten.addPayment(month, amount);

    }

    public void userInputTenant() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input the tenant name: ");
        String name = scan.nextLine();

        System.out.println("Please input the tenant apartment number: ");
        int aptNum = scan.nextInt();

        TenantObject t = new TenantObject(name, aptNum);
        tenantRecord.addTenant(t);
    }

    public void displayTenantRecord() {
        tenantRecord.displayTenantRecord();
    }

    public void displayPaymentRecord() {
        tenantRecord.displayPaymentRecord();
    }
}
