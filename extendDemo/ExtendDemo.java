package javaNotes.extendDemo;

public class ExtendDemo {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);
        Person p = s;
        Object o1 = s;
        Object o2 = p;
        System.out.println(s.score);

    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}
