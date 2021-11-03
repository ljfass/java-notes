package javaNotes.abstractDemo;

abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Salary extends Employee {
    private double salary;

    public Salary(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("xiaoming", 100.0);
        System.out.println(s.getName());
    }
}