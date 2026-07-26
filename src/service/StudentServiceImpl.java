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
    String searchId = sc.nextLine();
    Student student = repository.searchStudentById(searchId);
    if(searchId == null) { 
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
    System.out.print("Enter Student ID to update: ");
    String id = sc.nextLine();

    Student student = repository.searchStudentById(id);

    if (student == null) {
        System.out.println("Student ID not found!");
        return;
    }

    Student updateStudent = new Student();

    updateStudent.setStudentId(id);

    System.out.print("Enter New Name: ");
    updateStudent.setName(sc.nextLine());

    System.out.print("Enter New Department: ");
    updateStudent.setDepartment(sc.nextLine());

    System.out.print("Enter New Email: ");
    updateStudent.setEmail(sc.nextLine());

    System.out.print("Enter New Phone Number: ");
    updateStudent.setPhoneNumber(sc.nextLine());

    boolean updated = repository.updateStudent(updateStudent);

    if (updated) {
        System.out.println("Student updated successfully!");
    } else {
        System.out.println("Student update failed!");
    }
}

  public void deleteStudent(){
    System.out.print("Enter student Id : ");
    String id = sc.nextLine();
    boolean delete = repository.deleteStudent(id);
    if(delete){
      System.out.println("Student data successfully deleted.");
    }
    else {
      System.out.println("Student Id not found.please check again!");
    }

  }
}
