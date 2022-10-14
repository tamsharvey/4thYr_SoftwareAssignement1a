package org.SoftwareAssignment1a;

import SoftwareAssignment1a.Lecturer;
import SoftwareAssignment1a.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLecture
{
    Student student = new Student("Tamsin", 22, "19731719", "18/02/2000");
    Lecturer lecturer = new Lecturer("Paul", 47, "12345678", "02/03/1975");

    @Test
    public void testGenUsernameStudent()
    {
        assertEquals("Tamsin22", student.getUserName());
    }

    @Test
    public void testGenUsernameLecturer()
    {
        assertEquals("Paul47", lecturer.getUserName());
    }


}
