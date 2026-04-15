package main;

import service.StudentService;
import model.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Update 6.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                while(name.trim().isEmpty()){
                    System.out.print("Name cannot be empty, enter again: ");
                    name = sc.nextLine();
                }
                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                service.addStudent(new Student(id, name, age));
            }

            else if (choice == 2) {
                service.viewStudents();
            }

            else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();
                service.searchStudent(id);
            }

            else if (choice == 4) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                service.deleteStudent(id);
            }

            else if(choice == 5){
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new name: ");
                String name = sc.nextLine();

                System.out.print("Enter new age: ");
                int age = sc.nextInt();

                service.updateStudent(id, name, age);
            }
            else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}