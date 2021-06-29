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

public class LoginRecord
{
    ArrayList<LoginObject> LoginRecord;

    public LoginRecord() {
        
    }

    public ArrayList getLoginRecord(){
        return LoginRecord;
    }

    public void addLogin(LoginObject L){
        LoginRecord.add(L);
    }

    public void displayLoginRecord(){
        for(int i = 0; i < LoginRecord.size(); i++) {
            System.out.println(Arrays.toString(LoginRecord.get(i)));
        }
    }
}
