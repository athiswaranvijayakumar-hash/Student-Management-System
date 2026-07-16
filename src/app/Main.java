package app;
import menu.*;
import java.util.*;
import service.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentService studentService = new StudentServiceImpl();
    Menu menu = new Menu();
    while(true){
       menu.displayMenu();
       System.out.print("Enter your choice : ");
       int choice = sc.nextInt();
       //choice selecting
       switch (choice) {
        case 1:
          studentService.addStudent();
          break;
       
        default:
          System.out.println("invalid choice.");
          break;
       }
    }
  }
}
