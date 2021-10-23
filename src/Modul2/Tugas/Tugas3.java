package Modul2.Tugas;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int[] a, b, c;

        System.out.print("Masukkan Jumlah Testcase: ");
        data = input.nextInt();
        a = new int[data];
        b = new int[data];
        c = new int[data];

        for (int i = 0; i < data; i++) {
            System.out.print("Masukan A" + (i + 1) + " : ");
            a[i] = input.nextInt();
            System.out.print("Masukan B" + (i + 1) + " : ");
            b[i] = input.nextInt();
            System.out.print("Masukan C" + (i + 1) + " : ");
            c[i] = input.nextInt();
            System.out.println();
        }
        for (int i = 0; i < data; i++) {
            System.out.print("A" + (i + 1) + " + B" + (i + 1) + " - C" + (i + 1) + " = ");
            System.out.println(a[i] + b[i] - c[i]);
        }
    }
}
