package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job first_job_id_test;
    Job second_job_id_test;

    @Before
    public void createJobIdTest() {
        first_job_id_test = new Job();
        second_job_id_test = new Job();
    }

    //Test the empty constructor
    @Test
    public void testSettingJobId() {
        assertFalse(first_job_id_test.getId() == second_job_id_test.getId());
    }

    //Test the full constructor
    //TODO checking with Gerard on this one....
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_for_all_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_for_all_fields instanceof Job);
    }

    //test the equals method
    @Test
    public void testJobsForEquality() {
        Job test_with_different_id1 = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_with_different_id2 = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_with_different_id1 == test_with_different_id2);
    }
}
