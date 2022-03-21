package Homework7;

public class Hwpro14Person {
    String firstName = "";
    String lastName = "";
    int age = 0;

    //....
    public String getFirstName() {
        return firstName;
    }

    //get lastname method
    public String getLastName() {
        return lastName;
    }

    //get age method
    public int getAge() {
        return age;
    }

    //set firstname
    public void setFirstName(String updateFirstName) {
        this.firstName = updateFirstName;
    }

    //set LastName
    public void setLastName(String updateLastName) {
        this.lastName = updateLastName;
    }

    //set age
    public void setAge(int updatedAge) {
        if (updatedAge > 100 || updatedAge < 0) {
            System.out.println("Invalid value for age");
            return;
        }
        this.age = updatedAge;
    }

    //is Teen
    public boolean isTeen() {
        return age > 12 && age < 20;// age ture
    }

    //get fullName
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        if (firstName.isEmpty()) return this.lastName;
        if (lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }

    //
    public static void main(String[] args) {
        Hwpro14Person person = new Hwpro14Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("Joy");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Jeet");
        System.out.println("FullName = " + person.getFullName());


    }

}




