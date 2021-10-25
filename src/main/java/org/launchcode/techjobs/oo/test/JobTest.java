package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job testJob1 = new Job();
    Job testJob2 = new Job();
    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
            System.out.println("IDs match"); // my own identifier test has passed; (Actually this would print anyways I believe =(..)

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob3.getName(), Boolean.parseBoolean("Product tester"));
        assertTrue(testJob3 instanceof Job);
        assertEquals(testJob3.getEmployer(), "ACME");
        assertEquals(testJob3.getLocation(), "Desert");
        assertEquals(testJob3.getPositionType(), "Quality control");
        assertEquals(testJob3.getCoreCompetency(), "Persistence");


    }

}

