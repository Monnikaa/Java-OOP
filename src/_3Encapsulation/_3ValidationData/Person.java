package _3Encapsulation._3ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private double increaseSalary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    private void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 3) {
            System.out.println("First name cannot be less than 3 symbols");
            return;
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName == null || lastName.length() <3){
            System.out.println("Last name cannot be less than 3 symbols");
            return;
        }
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age <= 0){
            System.out.println("Age cannot be zero or negative integer");
            return;
        }
        this.age = age;
    }

    private void setSalary(double salary) {
        if (salary <= 460){
            System.out.println("Salary cannot be less than 460 leva");
            return;
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getIncreaseSalary(){
        return increaseSalary;
    }

    private void increaseSalary(double bonus) {
        if (this.age >= 30) {
            this.salary += (this.salary * bonus) / 100;
        } else {
            this.salary += this.salary * (0.5 * bonus) / 100;
        }
    }

    @Override
    public String toString() {
        String temlate = "%s %s gets %f leva";
        return String.format(temlate,this.firstName, this.lastName, this.salary);
    }
}