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
import com.team10.objects.TenantObject;
import com.team10.records.ExpenseRecord;
import com.team10.records.TenantRecord;

import java.util.Scanner;

public class UserInterface
{
    TenantRecord tenantRecord;
    ExpenseRecord expenseRecord;
    AnnualReport annualReport;
    Scanner scan = new Scanner(System.in);

    public UserInterface() {
        tenantRecord = new TenantRecord();
        expenseRecord = new ExpenseRecord();
        annualReport = new AnnualReport(tenantRecord, expenseRecord);
    }

    public void userInterfaceLoop() {
        boolean login = true;
        while (login) {
            System.out.println("Enter 't' to add a tenant, \n" +
            "'p' to add a payment, \n" +
            "'e' to add an expense, \n" +
            "'a' to view the annual record, \n" +
            "'1' to view the tenant report, \n" +
            "'2' to view the payment report, \n" +
            "'3' to view the expense report, \n" +
            "'x' to exit the program");
            String input = scan.nextLine();
            switch(input) {
                case "t":
                    userInputTenant();
                    break;
                case "p":
                    userInputPayment();
                    break;
                case "e":
                    userInputExpense();
                    break;
                case "a":
                    displayAnnualReport();
                    break;
                case "1":
                    displayTenantRecord();
                    break;
                case "2":
                    displayPaymentRecord();
                    break;
                case "3":
                    displayExpenseRecord();
                    break;
                case "x":
                    login = false;
                    break;  
                default:
                    System.out.println("Invalid input. Please try again: ");
              }
        }

        scan.close();
    }

    public void userInputExpense() {
        System.out.println("Enter month of expense: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        int month = scan.nextInt();

        System.out.println("Enter day of expense: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        int day = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter payee name: ");
        String payee = scan.nextLine();

        System.out.println("Enter expense amount: ");
        while (!scan.hasNextDouble()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        double amount = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter expense category: ");
        String category = scan.nextLine();

        ExpenseObject exp = new ExpenseObject(month, day, payee, amount, category);
        expenseRecord.addExpense(exp);
    }

    public void userInputPayment() {
        System.out.println("Enter tenant apartment number: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        int aptNum  = scan.nextInt();

        System.out.println("Enter month of payment: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        int month = scan.nextInt();

        System.out.println("Enter amount paid: ");
        while (!scan.hasNextDouble()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        double amount = scan.nextDouble();

        TenantObject ten = tenantRecord.getTenant(aptNum);
        ten.addPayment(month, amount);
    }

    public void userInputTenant() {
        System.out.println("Enter tenant name: ");
        String name = scan.nextLine();

        System.out.println("Enter tenant apartment number: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid Input. Please try again: ");
            scan.next();
        }
        int aptNum  = scan.nextInt();


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

    public void displayAnnualReport() {
        annualReport.displayReport();
    }
}
