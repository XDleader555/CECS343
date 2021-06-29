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

import com.team10.UserInterface;
import com.team10.objects.TenantObject;
import com.team10.records.LoginRecord;
import com.team10.records.TenantRecord;

import java.util.Scanner;

public class App 
{

    
    public static void main( String[] args )
    {
        LoginRecord login = new LoginRecord();
        Scanner userin = new Scanner(System.in);

        TenantRecord tenantRecord = new TenantRecord();
        try {
            tenantRecord.TenantReader();
        } catch (Exception e) {
            System.out.println("No File TenantList.txt Exists.");
        }
        

        while(true) { 
            login.displayPrompt();
            
            UserInterface ui = new UserInterface();
            ui.userInterfaceLoop();
            /*ui.userInputTenant();
            ui.displayTenantRecord();
            ui.userInputPayment();
            ui.displayPaymentRecord();
            ui.userInputExpense();
            ui.displayExpenseRecord();
            ui.displayAnnualReport();*/
        }
    }
}
