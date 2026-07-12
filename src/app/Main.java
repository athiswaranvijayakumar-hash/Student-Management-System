package app;
import menu.*;
import java.util.*;
import model.Student;
public class Main {
  public static void main(String[] args) {
    System.out.println("==============================");
    System.out.println("  Student Management System.");
    System.out.println("==============================");
    Menu menu = new Menu();
    menu.DisplayMenu();
    Scanner sc  = new Scanner(System.in);
    int num = sc.nextInt();
    Student student = new Student();
    if(num==2) {
    student.setStudentId("101");
    student.setName("Athiswaran v");
    student.setDepartment("AI&DS");
    student.setEmail("athis@gmail.com");
    student.setPhoneNumber("7845848503");
    }
    System.out.println(student.getStudentId());
     System.out.println(student.getName());
     System.out.println(student.getDepartment());
     System.out.println(student.getEmail());
     System.out.println(student.getPhoneNumber());
     sc.close();
  }
}
