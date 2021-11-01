package javaNotes.overloading;

public class overloading {
    public int test() {
        System.out.println("test1");
        return 1;
    }

    public void test(int a) {
        System.out.println("test2");
    }

    // 以下两个参数类型顺序不同
    public String test(String s, int a) {
        return "a";
    }

    public String test(int a, String s) {
        return "a";
    }
}
