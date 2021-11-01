package javaNotes.superkeyword;

public class SuperKeyword {
    public static void main(String args[]) {
        Animal b = new Dog();
        b.move();
    }
}

class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    public void move() {
        super.move();
        System.out.println("狗可以跑和走");
    }
}