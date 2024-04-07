package _3Encapsulation._2SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public void increaseSalary(double bonus){

            this.salary += (this.salary * bonus) / 100;
    }

    @Override
    public String toString() {
       String temlate = "%s %s gets %f leva";
       return String.format(temlate,this.firstName, this.lastName, this.salary);
    }
}
