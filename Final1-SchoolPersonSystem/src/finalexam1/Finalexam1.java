/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam1;

import java.util.GregorianCalendar;

/**
 *
 * @author z_hexiao
 */
public class Finalexam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Finalexam1 CEJV416= new Finalexam1();
      CEJV416.textStaff();
      CEJV416.textStudent();
        
   }
    
    public boolean textStudent(){
    Student a =new Student("Amin","Montreal","514-848-2424","amin@concordia.ca","freshman");
    Student b =new Student("Amin","Montreal","514-848-2424","amin@concordia.ca","freshman");
    System.out.println("The result is "+a.equals(b));
    return a.equals(b);
    }
    
    public void textStaff(){
    GregorianCalendar datehired = new GregorianCalendar(2012,9,22);
    Staff x = new Staff("Amin","Montreal","514-848-2424","amin@concordia.ca","f-252",35000,datehired,"secretary");
    System.out.println(x.toPrint());
    System.out.println(x.toString());
    
    
    
    }
    
    
    
    
    
    
}
