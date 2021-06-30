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
import com.team10.SaveObject;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        // Call constructor to update save path
        try {
            SaveObject.init(new File(SaveObject.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath() + "\\data");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        LoginRecord login = new LoginRecord();

        
        while(true) { 
            login.displayPrompt();
            
            UserInterface ui = new UserInterface();
            ui.userInterfaceLoop();
        }
    }
}
