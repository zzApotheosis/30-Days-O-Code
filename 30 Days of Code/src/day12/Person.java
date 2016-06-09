/*
 * Created by Steven Jennings (zzApotheosis) on 08 June 2016.
 */

package day12;

class Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    void printPerson() {
        System.out.println("Name: " + this.lastName + ", " + this.firstName + "\nID: " + this.idNumber);
    }
}
