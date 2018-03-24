/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam1;

/**
 *
 * @author z_hexiao
 */
public abstract class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    Person() {
    }

    Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return  "name:          " + name + "\n"
                + "address:       " + address + "\n"
                + "phoneNumber:   " + phoneNumber + "\n"
                + "emailAddress:  " + emailAddress + "\n";
    }

    public boolean equals(Person obj) {
        if (this.name.equals(obj.name) && this.address.equals(obj.address)
                && this.phoneNumber.equals(obj.phoneNumber) && this.emailAddress.equals(obj.emailAddress)) {
            return true;
        } else {
            return false;
        }
    }

    abstract String toPrint();

}
