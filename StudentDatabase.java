
package studentdatabaseapp;

import java.util.Scanner;


public class StudentDatabase { 
    
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int balance;
    private final int costOfCourse = 3000;
    private static int id = 1000;
    private int level;
    Scanner input = new Scanner(System.in);
    public StudentDatabase(){
     
        
        System.out.print("Enter your first name: ");
        this.firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        this.lastName = input.nextLine(); 
        
        this.gradeYear = setGradeYear();
        
        setStudentID();
      
    } 
    
    private String setGradeYear(){
      System.out.print("Grade Levels \n1 -  100 Level\n2 - 200 Level\n3 - 300 Level\n"
                + "4 - 400 Level\n5 - 500 Level\n6 - Postgraduate\nEnter your level: ");
       this.level = input.nextInt();
        switch (this.level){
            case 1: return "100 Level"; 
            case 2: return "200 Level"; 
            case 3: return "300 Level"; 
            case 4: return "400 Level"; 
            case 5: return "500 Level"; 
            default: return "Postgraduate";
        }
    } 
    
    private void setStudentID(){ 
        id++;
        this.studentID = (this.level + "" + id);
    } 
    
    public void enroll(){
          input.nextLine();
        do { 
           System.out.print("Enter the course you want to enroll (ENTER 'Q' TO QUIT): ");
           String course = input.nextLine().toUpperCase();
            if(!course.toUpperCase().equals("Q")){
            courses =   courses  +"\n "  +  course ;
            balance += costOfCourse;
            }
            else { break;}
        }while(true); 
        
  } 
    
    private void showBalance(){
        System.out.println("Your tuition balance is N" +balance);
    }
    public void payTuition(){
        showBalance();
        System.out.print("Enter your payment in N");
        int payment = input.nextInt();
        balance -= payment;
        showBalance();
    } 
    
    public String showInfo(){
        return "Name: " + firstName + " " + lastName + "\n" + 
                "Level: " + gradeYear + "\n"+
                "Student ID: " + studentID + "\n"
                + "Enrolled In: " +courses + "\n"
                + "Tuition Balance: " +balance;    
    }
}
