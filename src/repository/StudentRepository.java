package repository;
import java.util.*;
import model.*;
public class StudentRepository {
  private ArrayList<Student> students = new ArrayList<>();
  public void addStudent(Student student){
    students.add(student);
  }
  public ArrayList<Student> viewAllStudent(){
    return students;
  }
  public Student searchStudentById(String id){
    for(Student student : students){
      if(student.getStudentId().equals(id)){
        return student;
      }
    }
    return null;
  }
  public boolean deleteStudent(String id){
    Student student = searchStudentById(id);
    if(student != null){
      students.remove(student);
      return true;
    }
    return false;
  }
  public boolean updateStudent(Student updateStudent){
    Student existing = searchStudentById(updateStudent.getStudentId());
    if(existing != null){
      existing.setName(updateStudent.getName());
      existing.setStudentId(updateStudent.getStudentId());
      existing.setDepartment(updateStudent.getDepartment());
      existing.setEmail(updateStudent.getEmail());
      existing.setPhoneNumber(updateStudent.getPhoneNumber());
      return true;
    }
    return false;
  }
}
