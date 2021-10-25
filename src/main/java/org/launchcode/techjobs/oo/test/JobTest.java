package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job testJob1 = new Job();
    Job testJob2 = new Job();
    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
            System.out.println("IDs match"); // my own identifier test has passed; (Actually this would print anyways I believe =(..)
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertNotNull(testJob1);
        assertNotNull(testJob2);
        assertNotNull(testJob3);
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

// I had expected and actual switched around. No new tests passed though =/

//        assertEquals(testJob3.getName(), "Product tester");
//        assertEquals(testJob3.getEmployer(), "ACME");
//        assertEquals(testJob3.getLocation(), "Desert");
//        assertEquals(testJob3.getPositionType(), "Quality control");
//        assertEquals(testJob3.getCoreCompetency(), "Persistence");

        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer());
        assertEquals("Desert", testJob3.getLocation());
        assertEquals("Quality control", testJob3.getPositionType());
        assertEquals("Persistence", testJob3.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(testJob3, testJob4);




    }

}

