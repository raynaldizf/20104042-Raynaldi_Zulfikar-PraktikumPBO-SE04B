package Modul3.Praktikum.bank;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    public void ambilUang(int jumlah){
        //Substaction assignment
        //Saldo = saldo -jumlah
        saldo-=jumlah;
    }
    public int getSaldo(){
        return saldo;
    }
}
