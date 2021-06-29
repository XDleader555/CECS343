/**
 * objects/LoginObject.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10.objects;

import com.team10.records.LoginRecord;

public class LoginObject
{   
    String UserName;
    String Password;
    String Email;

    public LoginObject() {
        
    }

    public LoginObject(String Username, String Password){
        this.UserName = Username;
        this.Password = Password;
    }

    //Set and Get
    public void SetUserName(String UserName){
        this.UserName = UserName;
    }

    public String GetUserName(){
        return UserName;
    }

    public void SetPassword(String Password){
        this.Password = Password;
    }

    public String GetPassword(){
        return Password;
    }

    public void SetEmail(String Email){
        this.Email = Email;
    }
    
    public String GetEmail(){
        return Email;
    }

}
