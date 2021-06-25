/**
 * objects/ExpenseObject.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10.objects;

import com.team10.records.ExpenseRecord;

public class ExpenseObject
{
    int month;
    int day;
    String payee;
    double amount;
    String category;

    public ExpenseObject() {
        
    }

    public ExpenseObject(int month, int day, String payee, double amount, String category) {
        this.month = month;
        this.day = day;
        this.payee = payee;
        this.amount = amount;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String toString() {
        return month + "/" + day + " " + payee + " " + amount + " " + category;
    }
}
