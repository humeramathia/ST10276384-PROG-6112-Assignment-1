import St10276384_prog_poe_assignment1.Student;
import St10276384_prog_poe_assignment1.StudentManagement;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementTest {

    private StudentManagement studentManagement;

    @Before
    public void setUp() {
        studentManagement = new StudentManagement();
    }

    @Test
    public void testCaptureStudent() {
        // Capture a new student
        studentManagement.captureStudent("10111", "J.Bloggs", 19, "jbloggs@gmail.com", "disd");
        
        // Verify the student was added
        Student student = studentManagement.searchStudentById("10111");
        assertNotNull(student);
        assertEquals("J.Bloggs", student.getName());
        assertEquals(19, student.getAge());
        assertEquals("jbloggs@gmail.com", student.getEmail());
        assertEquals("disd", student.getCourse());
    }

    @Test
    public void testSearchStudent() {
        // Add a student and search for it
        studentManagement.captureStudent("10112", "J.Doe", 21, "jdoe@gmail.com", "disd");
        
        // Search for the student by ID
        Student student = studentManagement.searchStudentById("10112");
        assertNotNull(student);
        assertEquals("J.Doe", student.getName());
    }

    @Test
    public void testDeleteStudent() {
        // Add a student, then delete it
        studentManagement.captureStudent("10113", "P.Parker", 20, "spidey@gmail.com", "disn");
        
        // Delete the student
        boolean isDeleted = studentManagement.deleteStudentById("10113");
        assertTrue(isDeleted);
        
        // Try to find the deleted student
        Student student = studentManagement.searchStudentById("10113");
        assertNull(student);
    }

    @Test
    public void testPrintStudentReport() {
        // Add a few students
        studentManagement.captureStudent("10111", "J.Bloggs", 19, "jbloggs@gmail.com", "disd");
        studentManagement.captureStudent("10112", "J.Doe", 21, "jdoe@gmail.com", "disd");
        studentManagement.captureStudent("10113", "P.Parker", 20, "spidey@gmail.com", "disn");
        
        // Generate the student report
        String report = studentManagement.generateStudentReport();
        
        // Verify that the report contains information for all added students
        assertTrue(report.contains("J.Bloggs"));
        assertTrue(report.contains("J.Doe"));
        assertTrue(report.contains("P.Parker"));
    }
}
