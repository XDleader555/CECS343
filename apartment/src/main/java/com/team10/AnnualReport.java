/**
 * AnnualReport.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10;

import java.util.ArrayList;

import com.team10.records.ExpenseRecord;
import com.team10.records.TenantRecord;

public class AnnualReport
{
    TenantRecord tenantRecord;
    ExpenseRecord expenseRecord;

    public AnnualReport() {
        
    }

    public AnnualReport(TenantRecord tenantRecord, ExpenseRecord expenseRecord) {
        this.tenantRecord = tenantRecord;
        this.expenseRecord = expenseRecord;
    }

    public void displayReport() {
        double income = tenantRecord.calculatePaymentSum();
        double expense = expenseRecord.calculateExpenseSum();
        double balance = income - expense;

        ArrayList<String> categories = expenseRecord.getCategories();

        System.out.println("Income");
        System.out.println("Rent: " + income);
        System.out.println("Expenses");
        expenseRecord.displayExpenseCategoryRecord();
        System.out.println("Balance: " + balance);
    }
}
