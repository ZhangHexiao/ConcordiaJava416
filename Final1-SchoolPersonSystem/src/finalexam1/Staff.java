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
public class Staff extends Employee {

    private String title;

    Staff() {
    }

    Staff(String name, String address, String phoneNumber, String emailAddress, String office,
            double salary, GregorianCalendar dateHired, String title) {

        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "name:          " + super.getName() + "\n"
                + "address:       " + super.getAddress() + "\n"
                + "phoneNumber:   " + super.getPhoneNumber() + "\n"
                + "emailAddress:  " + super.getEmailAddress() + "\n"
                + "salary:        " + super.getSalary() + "\n"
                + "office:        " + super.getOffice() + "\n"
                + "dateHired:     " + super.getDateHired() + "\n"
                +"title:        " + title + "\n";   
    }

    @Override
    public String toPrint() {
        return "The name of the class is "+this.getClass().getName()+"\n"
                + "The name of super class is " + super.getClass().getName();
    }

}
