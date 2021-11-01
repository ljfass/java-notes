package javaNotes.override;

class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("狗可以跑和走");
    }

    public void bark() {
        System.out.println("狗可以吠叫");
    }
}

public class OverrideDemo {
    public static void main(String args[]) {
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();// 执行 Dog 类的方法
        // b.bark();
    }
}

/* 该程序将抛出一个编译错误，因为b的引用类型Animal没有bark方法 */