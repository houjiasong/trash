package org.example;

import org.junit.Test;

public class UserTest {
    @Test
    public void hou() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("John Doe");
        System.out.println(doctor.toString());
    }
}
