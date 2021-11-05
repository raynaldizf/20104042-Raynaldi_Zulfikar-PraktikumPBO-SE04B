package Modul4.Praktikum.Percobaan2;

public class tabungan {
    private int saldo;
    private String nama;
    private int noRekening;
    private int pin;

    //Constructor
    public tabungan(){
        this.saldo=saldo;
    }
    //Overloading
    public tabungan(String nama,int noRekening){
        this.nama=nama;
        this.noRekening=noRekening;
        this.saldo=10000;
        this.pin=11111;
    }
    public tabungan(String nama,int noRekening,int saldo,int pin){
        this.saldo=saldo;
        this.nama=nama;
        this.noRekening=noRekening;
        this.pin=pin;
    }
    //Encapsulation
    public void simpanUang(int jumlah){
        saldo+=jumlah;
    }
    public void tarikUang(int jmlTarik){
        saldo-=jmlTarik;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int jumlah){
        this.saldo=saldo;
    }
    public int getPin(){
        return pin;
    }
    public void setPin(int pinBaru){
        this.pin=pinBaru;
    }
}
