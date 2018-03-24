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
public class Employee extends Person {

    private String office;
    private double salary;
    private GregorianCalendar dateHired;

    Employee() {
    }

    Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, GregorianCalendar dateHired) {
        super(name,address,phoneNumber,emailAddress);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }
    public void setSalary(double salary){
    this.salary = salary;
    }
    public void setOffice(String office){
    this.office = office;
    }   
    public void setDateHired(GregorianCalendar dateHired){
    this.dateHired=dateHired;
    }
     
    
    public double getSalary(){
    return salary;
    }
    public String getOffice(){
    return office;
    }   
    public GregorianCalendar getDateHired(){
    return dateHired;
    }
       
  
    
    @Override
    public String toString() {
        return  "name:          " + super.getName() + "\n"
                + "address:       " + super.getAddress() + "\n"
                + "phoneNumber:   " + super.getPhoneNumber() + "\n"
                + "emailAddress:  " + super.getEmailAddress() + "\n"
                + "salary:        " + salary  + "\n"
                + "office:        " + office + "\n"
                + "dateHired:     " + dateHired + "\n";
    }

    @Override
    public String toPrint() {
        return "The name of the class is "+this.getClass().getName()+"\n"
                + "The name of super class is " + super.getClass().getName();
    }
    
    
    
}
