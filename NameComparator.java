package ListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayLIst {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(1, "Nusrat", 23);
        Student s2 = new Student(11, "Anika", 55);
        Student s3 = new Student(5, "Fariha", 12);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(new Student(21, "Tumpa", 43));
        for (Student s:
            students ) {
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
        Collections.sort(students, new AgeComparator());
        System.out.println();
        System.out.println("after sorting");
        for (Student s:
                students ) {
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }

        Collections.sort(students, new NameComparator());
        System.out.println();
        System.out.println("after sorting");
        for (Student s:
                students ) {
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }

    }
}
