package javaNotes.extendDemo;

public class ExtendDemo {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);

    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        System.out.println("parent construct");
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
        System.out.println(this.name);

    }
}
