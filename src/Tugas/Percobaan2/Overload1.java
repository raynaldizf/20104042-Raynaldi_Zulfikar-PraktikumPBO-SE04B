package Tugas.Percobaan2;

public class Overload1 {
    void myMethod(short s) {
        System.out.println("Short");
    }

    void myMethod(int i) {
        System.out.println("Int");
    }

    void myMethod(long l) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        byte b = 1;

        Overload1 o = new Overload1();
        o.myMethod(b);
    }
}