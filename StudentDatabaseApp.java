
package studentdatabaseapp;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Dosunmu Ibrahim 9/8/19 11:49
 */
public class StudentDatabaseApp {

    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the number of students: ");
      int num = in.nextInt();
      StudentDatabase[] student = new StudentDatabase[num];
      
      for (int i = 0 ; i<num ; i++){
          student[i] = new StudentDatabase();
          student[i].enroll();
          student[i].payTuition();
      }
      for (int i = 0; i<num; i++){
          System.out.println( "\n" +student[i].showInfo() + "\n");
      }
    }
    
}
