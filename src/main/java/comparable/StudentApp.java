package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Zli", "Agasiyev", 99));
        students.add(new Student("Rəvan", "Ağayev", 24));
        students.add(new Student("Nicat", "Sahbaoc", 84));

        for (Student student1:students){
            System.out.println(student1);
        }


    }
}
