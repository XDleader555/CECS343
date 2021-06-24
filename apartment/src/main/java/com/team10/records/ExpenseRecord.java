/**
 * records/ExpenseRecord.java
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

import com.team10.objects.ExpenseObject;
import com.team10.records.RecordParent;

public class ExpenseRecord extends RecordParent
{
    ArrayList<ExpenseObject> expenseRecord;
    
    public ExpenseRecord() {
        expenseRecord = new ArrayList<ExpenseObject>();
    }

    public ArrayList getRecord() {
        return expenseRecord;
    }

    public void addExpense(ExpenseObject e) {
        expenseRecord.add(e);
    }

    public void displayExpenseRecord() {
        for(int i = 0; i < expenseRecord.size(); i++) {
            System.out.println(expenseRecord.get(i));
        }
    }
}
