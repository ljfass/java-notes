package javaNotes.duotaiDemo;

public class DuotaDemo2 {
    public static void main(String[] args) {
        Wine[] wines = new Wine[2];
        JNC jnc = new JNC();
        wines[0] = jnc;
        System.out.println(wines[0].toString() + "--" + wines[0].drink());
    }
}
