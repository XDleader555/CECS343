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
    ArrayList<String> categories;
    
    public ExpenseRecord() {
        expenseRecord = new ArrayList<ExpenseObject>();
        categories = new ArrayList<String>();
    }

    public ArrayList<ExpenseObject> getRecord() {
        return expenseRecord;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void addExpense(ExpenseObject e) {
        expenseRecord.add(e);
        if (!hasCategory(e.getCategory())) {
            categories.add(e.getCategory());
        }

    }

    public boolean hasCategory(String cat) {
        if (categories.size() == 0) {
            return false;
        }
        else {
            for(int i = 0; i < categories.size(); i++) {
                if (cat.equals(categories.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public double calculateExpenseSum() {
        double sum = 0;
        for(int i = 0; i < expenseRecord.size(); i++) {
            sum += expenseRecord.get(i).getAmount();
        }
        return sum;
    }

    public void displayExpenseRecord() {
        for(int i = 0; i < expenseRecord.size(); i++) {
            System.out.println(expenseRecord.get(i));
        }
    }

    public void displayExpenseCategoryRecord() {
        for (int i = 0; i < categories.size(); i++) {
            double catSum = 0;
            for (int j = 0; j < expenseRecord.size(); j++) {
                String expenseCategory = expenseRecord.get(j).getCategory();
                if (categories.get(i).equals(expenseCategory)) {
                    catSum += expenseRecord.get(j).getAmount();
                }
            }
            System.out.println(categories.get(i) + ": " + catSum);
        }
    }
}
