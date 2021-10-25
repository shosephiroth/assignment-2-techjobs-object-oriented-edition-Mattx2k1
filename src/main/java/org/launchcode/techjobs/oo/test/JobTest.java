package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job testJob1 = new Job();
    Job testJob2 = new Job();


    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
        System.out.println("IDs match"); // my own identifier test has passed; (It did!)

    }

}

