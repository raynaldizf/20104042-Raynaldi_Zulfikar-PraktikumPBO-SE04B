package Modul4.Praktikum.Percobaan1;

public class mainClass {
    public static void main(String[] args) {
        tabungan tabungan1 = new tabungan("Barca",50410420,1000000,12345);
        System.out.println("Nama \t\t : "+tabungan1.getNama());
        System.out.println("No Rekening  : "+tabungan1.getNoRekening());
        System.out.println("Saldo \t\t : "+tabungan1.getSaldo());
        System.out.println("Pin \t\t : "+tabungan1.getPin());
    }
}
