package Modul3.Praktikum.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saldo Awal Tabungan : ");
        int saldo=input.nextInt();
        Tabungan tabungan= new Tabungan(saldo);

        System.out.print("Jumlah uang yang diambil : ");
        int ambil=input.nextInt();
        tabungan.ambilUang(ambil);

        System.out.print("\nSaldo tabungan sekarang : ");
        System.out.print(tabungan.getSaldo());

    }
}
