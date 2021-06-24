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
import com.team10.records.ExpenseRecord;
import com.team10.records.TenantRecord;

import java.util.ArrayList;
import java.util.Scanner;

import com.team10.AnnualReport;

public class UserInterface
{
    TenantRecord tenantRecord = new TenantRecord();
    ExpenseRecord expenseRecord = new ExpenseRecord();

    public UserInterface() {
        
    }

    public void userInputExpense() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month of expense: ");
        int month = scan.nextInt();

        System.out.println("Enter day of expense: ");
        int day = scan.nextInt();

        System.out.println("Enter payee name: ");
        String payee = scan.nextLine();

        System.out.println("Enter expense amount: ");
        double amount = scan.nextDouble();

        System.out.println("Enter expense category: ");
        String category = scan.nextLine();

        ExpenseObject exp = new ExpenseObject(month, day, payee, amount, category);
        expenseRecord.addExpense(exp);
    }

    public void userInputPayment() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter tenant apartment number: ");
        int aptNum = scan.nextInt();

        System.out.println("Enter month of payment: ");
        int month = scan.nextInt();

        System.out.println("Enter amount paid: ");
        double amount = scan.nextDouble();

        TenantObject ten = tenantRecord.getTenant(aptNum);
        ten.addPayment(month, amount);

    }

    public void userInputTenant() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter tenant name: ");
        String name = scan.nextLine();

        System.out.println("Enter tenant apartment number: ");
        int aptNum = scan.nextInt();

        TenantObject t = new TenantObject(name, aptNum);
        tenantRecord.addTenant(t);
    }

    public void displayExpenseRecord() {
        expenseRecord.displayExpenseRecord();
    }

    public void displayPaymentRecord() {
        tenantRecord.displayPaymentRecord();
    }

    public void displayTenantRecord() {
        tenantRecord.displayTenantRecord();
    }
}
