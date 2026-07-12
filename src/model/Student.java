package model;


public class Student {
  private String studentId;
  private String name;
  private String department;
  private String email;
  private String phoneNumber;
  public void setStudentId(String studentId){
    this.studentId = studentId;
  }
  public void setName(String name){
    this.name = name;
  }
   public void setDepartment(String department) {
    this.department = department;
   }
    public void setEmail(String email){
    this.email = email;
    }
     public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
     }
  
  public String getStudentId(){
     return studentId; 
  }
    public String getName(){
     return name; 
  }
    public String getDepartment(){
     return department; 
  }
    public String getEmail(){
     return email; 
  }
    public String getPhoneNumber(){
     return phoneNumber; 
  }
}
