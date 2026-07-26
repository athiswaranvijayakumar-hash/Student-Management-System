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
        case 2:
          studentService.viewAllStudent();
          break;
          case 3:
            studentService.searchStudentById();
            break;
          case 4:
            studentService.deleteStudent();
            break;
          case 5:
            studentService.updateStudent();
            break;
          case 6:
            System.out.println("Exit.");
            return;
        default:
          System.out.println("invalid choice.");
          break;
       }
    }
  }
}
