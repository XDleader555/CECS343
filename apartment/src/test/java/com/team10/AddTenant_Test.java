package com.team10;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import com.team10.objects.TenantObject;
import com.team10.records.TenantRecord;
import com.team10.UserInterface;

/**
 * Unit test for simple App.
 */
public class AddTenant_Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        // Emulate the user input
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(("Guchi" + System.lineSeparator() + "404" + System.lineSeparator()).getBytes()));
        UserInterface ui = new UserInterface();

        // Test the system
        System.out.println("[debug] Entering a new Tenant");
        ui.userInputTenant();

        // Verify the tenant was entered correctly
        assertTrue(!ui.tenantRecord.getTenant(404).equals(null));

        // Cleanup
        System.setIn(stdin);
        System.out.println("Unit test Passed");
    }
}
