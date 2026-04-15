package service;

import model.Student;
import java.util.*;

public class StudentService {

    ArrayList<Student> list = new ArrayList<>();

    // ADD
    public void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added!");
    }

    // VIEW
    public void viewStudents() {
        list.sort((a,b) -> a.name.compareTo(b.name));
        for (Student s : list) {
            s.display();
        }
    }

    // SEARCH
    public void searchStudent(int id) {
        for (Student s : list) {
            if (s.id == id) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // UPDATE
    public void updateStudent(int id, String newName, int newAge) {
        for (Student s : list) {
            if (s.id == id) {
                s.name = newName;
                s.age = newAge;
                System.out.println("Student Updated!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
    // DELETE
    public void deleteStudent(int id) {
        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == id) {
                it.remove();
                System.out.println("Student Deleted!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}