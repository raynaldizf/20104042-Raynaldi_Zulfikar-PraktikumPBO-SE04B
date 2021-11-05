package Modul4.Praktikum.Percobaan1;

public class tabungan {
    private String nama;
    private int noRekening;
    private int pin;
    private int saldo;

    //Constructor
    public tabungan(){
        this.saldo=5000;
    }
    //@overloading
    public tabungan(String nama, int noRekening,int saldo, int pin){
        this.saldo=saldo;
        this.nama=nama;
        this.noRekening=noRekening;
        this.pin=pin;
    }
    //Encapsulation
    //Getter
    public int getSaldo(){
        return saldo;
    }
    //Encapsulation
    //Setter
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public int getPin(){
        return pin;
    }
    public int getNoRekening(){
        return noRekening;
    }
    public String getNama(){
        return nama;
    }

}
