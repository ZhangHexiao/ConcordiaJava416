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
public class Student extends Person {

    private String status;

    Student() {
    }

    Student(String name, String address, String phoneNumber, String emailAddress, String status) {

        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "name:          " + super.getName() + "\n"
                + "address:       " + super.getAddress() + "\n"
                + "phoneNumber:   " + super.getPhoneNumber() + "\n"
                + "emailAddress:  " + super.getEmailAddress() + "\n"
                + "status:        " + status + "\n";
    }

    @Override
    public String toPrint() {
        return "The name of the class is "+this.getClass().getName()+"\n"
                + "The name of super class is " + super.getClass().getName();
    }


}
