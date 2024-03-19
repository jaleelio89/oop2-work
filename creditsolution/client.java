// jaleel forsythe ////ID2017002533///
//mikado// meikle// ID 201700955//
//errol greenland//ID 2017001595//
//brian davis /// ID 2017001804//
package creditsolution;

import java.util.Scanner;

public class client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private card card;

    public client() {
    }

    public client(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public card getCard() {
        return card;
    }

    public void setCard(card card) {
        this.card = card;
    }

    public void display() {
        System.out.println("client Information:");
        System.out.println("ID Number: " + idNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        card.display();
    }
}


