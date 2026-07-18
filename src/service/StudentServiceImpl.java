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
      repository.addStudent(student);
      System.out.println("Student detail Add successfully.");
  }
  public void viewAllStudent(){
     List<Student> students = repository.viewAllStudent();
     if(students.isEmpty()){
      System.out.println("Student list not found.");
      return;
     }
     for(Student student : students){
      System.out.println("---------------------------------------");
      System.out.println("Id : " + student.getStudentId());
      System.out.println("Name : " + student.getName());
      System.out.println("Department : " + student.getDepartment());
      System.out.println("Email : " + student.getEmail());
      System.out.println("PhoneNumber : " + student.getPhoneNumber());
     }
  }
  public void searchStudentById(){
    System.out.print("Enter your Student Id : ");
    String id = sc.nextLine();
    Student student = repository.searchStudentById(id);
    if(id == null) { 
      System.out.println("Student Id not found. Please check again!");
      return;
    }
    System.out.println("Id : " + student.getStudentId());
    System.out.println("Name :  " + student.getName());
    System.out.println("Department : " + student.getDepartment());
    System.out.println("Email : " + student.getEmail());
    System.out.println("PhoneNumber : " + student.getPhoneNumber());
 
  }
  public void updateStudent(){

  }
  public void deleteStudent(){

  }
}
