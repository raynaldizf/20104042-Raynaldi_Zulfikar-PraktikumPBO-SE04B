package Modul5.Praktikum.Percobaan1.Mahasiswa;

public class Mahasiswa {
    private int nrp;
    private String nama;


    //Constructor
    public Mahasiswa(){

    }
    //Overloading Construct
    public Mahasiswa(int nrp){
        this.nrp=nrp;
    }
    //Overloading Construct
    public Mahasiswa(int nrp,String nama){
        this.nrp=nrp;
        this.nama=nama;
    }
    public int getNrp(){
        return nrp;
    }
    public String getNama(){
        return nama;
    }
}
