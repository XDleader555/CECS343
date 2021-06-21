/**
 * records/TenantRecord.java
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

import com.team10.objects.TenantObject;
import com.team10.records.RecordParent;

public class TenantRecord extends RecordParent
{   
    ArrayList<TenantObject> tenantRecord;
    
    public TenantRecord() {
        
    }

    public ArrayList getRecord() {
        return tenantRecord;
    }

    public void addTenant(TenantObject t) {
        tenantRecord.add(t);
    }
}
