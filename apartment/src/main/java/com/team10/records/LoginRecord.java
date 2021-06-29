/**
 * records/LoginRecord.java
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
import java.util.Arrays;

import com.team10.objects.LoginObject;
import java.util.Scanner;
import java.lang.Thread;

public class LoginRecord
{
    ArrayList<LoginObject> LoginRecord;

    public LoginRecord() {
        // Someone add the import previous logins here!!

        // Initialize a new login record
        if(LoginRecord == null) {
            System.out.println("New system detected. Please input new credentials.");
            displayPrompt();
        }
    }

    public void displayPrompt() {
        Scanner userin = new Scanner(System.in);
        String username;
        String password;

        // Loop the login prompt
        while(true) {
            System.out.print("Username: ");
            username = userin.nextLine();

            System.out.print("Password: ");
            password = userin.nextLine();

            // Verify the login
            if(verifyLogin(username, password)) {
                break;
            }

            System.out.println("Invalid login\n");

            // Sleep the system
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ie) {
                // Do nothing
            }
        }
    }

    private boolean verifyLogin(String username, String password) {
        if(LoginRecord == null) {
            LoginRecord = new ArrayList<>();
            LoginRecord.add(new LoginObject(username, password));

            System.out.println("New login accepted.\n");
            return true;
        }

        for(LoginObject record:LoginRecord) {
            //System.out.printf("Debug: username=%s, password=%s\n", record.GetUserName(), record.GetPassword());
            if(username.equals(record.GetUserName())) {
                if(password.equals(record.GetPassword())) {
                    System.out.println("Login Verified.\n");
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList getLoginRecord(){
        return LoginRecord;
    }

    public void addLogin(LoginObject L){
        LoginRecord.add(L);
    }

    // public void displayLoginRecord(){
    //     for(int i = 0; i < LoginRecord.size(); i++) {
    //         System.out.println(Arrays.toString(LoginRecord.get(i)));
    //     }
    // }
}
