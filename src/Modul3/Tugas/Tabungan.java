package Modul3.Tugas;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo=saldo;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah <= saldo){
            saldo-=jumlah;
            return true;
        }else {
            return false;
        }
    }

    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        saldo+=jumlah;
    }
}
