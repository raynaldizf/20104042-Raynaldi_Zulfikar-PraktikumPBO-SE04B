package Modul4.Praktikum.Percobaan2;

public class mainClass {
    public static void main(String[] args) {
       tabungan saya = new tabungan("Barca",12345);
       tabungan kamu = new tabungan("Manu",12467,15000,22222);
        System.out.println("Saldo awal saya : "+saya.getSaldo());
        System.out.println("Saldo awal kamu : "+kamu.getSaldo());
        System.out.println("Nomor pin saya : "+saya.getPin());
        System.out.println("Nomor pin kamu : "+kamu.getPin());
    }
}
