
package studentdatabaseapp;
/*
 * Dosunmu Ibrahim 9/8/19 11:49
 */
public class StudentDatabaseApp {

    
    public static void main(String[] args) {
       StudentDatabase std = new StudentDatabase();
       std.enroll();
       std.payTuition();
      System.out.println(std.showInfo());
    }
    
}
