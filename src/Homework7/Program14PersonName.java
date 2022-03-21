package Homework7;


//Person naming
public class Program14PersonName {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Program14PersonName s = new Program14PersonName();//calling object
        s.setFirstName(""); // firstName is  empty string
        s.setLastName(""); // lastName is  empty string
        s.setAge(10);
        System.out.println("fullName= " + s.getFullName());//print statement
        System.out.println("teen= " + s.isTeen());//print statement
        s.setFirstName("Teena"); // firstName is set to Bella
        s.setAge(17);
        System.out.println("fullName= " + s.getFullName());//print statement
        System.out.println("teen= " + s.isTeen());//print statement
        s.setLastName("Tim"); // lastName is  Shah
        System.out.println("fullName= " + s.getFullName());


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 && age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {//if condition
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {//if-else condition
            return " ";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }
}

