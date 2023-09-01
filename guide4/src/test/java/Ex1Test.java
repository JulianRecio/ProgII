import Ex1.Activity;
import Ex1.ActivityType;
import Ex1.Person;
import Ex1.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ex1Test {
    Person student1 = new Person("Juan Lopez", "12345678", Type.STUDENT);
    Person student2 = new Person("Pedro De Lorenzo", "12348765", Type.STUDENT);
    Person student3 = new Person("Ricardo Schmidt", "87654321", Type.STUDENT);

    @Test
    public void createCourseTest(){
        List<Person> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        List<Person> professorList = new ArrayList<>();
        Person professor1 = new Person("Martin Cicilia", "87651234", Type.TEACHER);
        professorList.add(professor1);

        Activity analysis1 = new Activity("Math analysis 1", ActivityType.COURSE, studentList, professorList);

        Assertions.assertEquals(analysis1.getStudentList(), studentList);
        Assertions.assertEquals(analysis1.getTeacherList(), professorList);
    }
}
