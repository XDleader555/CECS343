/**
 * SaveObject.java
 * 
 * Copyright (c) 2021
 * Andrew Miyaguchi
 * Eric Wang
 * Steven Barberi
 * California State University Long Beach
 * 
 */

package com.team10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveObject 
{
    static String path = null;

    public static void init(String p) {
        path = p;
        System.out.printf("Path: %s\n", path);

        // Create the data directory if it doesn't exist
        File f = new File(path);
        if(!f.isDirectory()) {
            f.mkdirs();
        }
    }

    public static void ExportObject(Object obj, String filename) {
        try {
            if(path.equals(null)) {
                throw new Exception("Save path missing, perhaps you forgot to call the constructor?");
            }

            File f = new File(path + "\\" + filename);
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.printf("Saved %s\n", filename);
        } catch(Exception e) {
            System.out.printf("Error saving %s.\n%s\n", filename, e.getMessage());
        }
    }

    public static Object ImportObject(String filename) {
        try {
            if(path.equals(null)) {
                throw new Exception("Save path missing, perhaps you forgot to call the constructor?");
            }
            
            File f = new File(path + "\\" + filename);
            if(!f.exists()) {
                throw new Exception(String.format("\"%s\" does not exist.", filename));
            }
            
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            ois.close();
            fis.close();
            System.out.printf("Imported %s\n", obj.getClass());
            return obj;
        } catch(Exception e) {
            System.out.printf("Error importing %s.\n%s\n", filename, e.getMessage());
            return null;
        }
    }
}