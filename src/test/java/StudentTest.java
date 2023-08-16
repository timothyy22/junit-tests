import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;
    private ArrayList<Integer> emptyArrayList;

    @Before
    public void setup() {
        actualStudent = new Student(123456, "timothy");
        emptyArrayList = new ArrayList<>();
    }

    @Test
    public void testStudentConstructor() {
        actualStudent = new Student(123456, "timothy");

        // assert that emptyCoffee is null
        assertNull(emptyStudent);
        // asser that actualCoffee is NOT null
        assertNotNull(actualStudent);

    }

    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 123456);
        assertEquals(actualStudent.getName(), "timothy");
        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), emptyArrayList);

    }

    public void testStudentAddGrade() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50, 75, 100));

        assertEquals(actualStudent.getGrades(), expectedGrades);

    }

    public void testStudentGetGradeAverage() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        assertEquals(actualStudent.getGradeAverage(), 75, 0.000001);
    }


}
