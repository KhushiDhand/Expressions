import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Students
        ArrayList<Student> list = new ArrayList<Student>();

        Student khushi = new Student("Khushi");
        Student anne = new Student("Anne");

        //Creation of the courses
        Courses c1 = new Courses("English", 89);
        Courses c2 = new Courses("Maths", 90);

        //An example of displaying the course object
        System.out.println("An example of a course object being printed:");
        c1.DisplayCourses();

        //Student #1
        //Adding courses to the Temp student object
        khushi.AddCourse(c1);
        khushi.AddCourse(c2);
        list.add(khushi);

        khushi.DisplayStudentInfo();

        //Student #2
        anne.AddCourse(c1);
        anne.AddCourse(c2);
        list.add(anne);
        anne.DisplayStudentInfo();
    }

}

