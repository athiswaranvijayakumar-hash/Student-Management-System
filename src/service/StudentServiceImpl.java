package service;
import repository.*;
import java.util.*;
import model.*;
public class StudentServiceImpl implements StudentService {
  Scanner sc = new Scanner(System.in);
  StudentRepository repository = new StudentRepository();
  @Override
  public void addStudent(){
       System.out.print("Enter the Student Id : ");
      String id = sc.nextLine();
      if(repository.searchStudentById(id) != null) {
        System.out.println("Student Id is already exist.");
        return;
      }
      System.out.print("Enter the Student name : ");
      String name = sc.nextLine();
      System.out.print("Enter the Student Department : ");
      String department = sc.nextLine();
      System.out.print("Enter the Student Email : ");
      String email = sc.nextLine();
      System.out.print("Enter the Student PhoneNumber : ");
      String phoneNumber = sc.nextLine();
      //Create Student object
      Student student = new Student();
      student.setStudentId(id);
      student.setName(name);
      student.setDepartment(department);
      student.setEmail(email);
      student.setPhoneNumber(phoneNumber);
      System.out.println("Student detail Add successfully.");
  }
  public void viewAllStudent(){

  }
  public void searchStudentById(){

  }
  public void updateStudent(){

  }
  public void deleteStudent(){

  }
}
