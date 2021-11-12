package Modul5.Praktikum.Percobaan2;

import Modul5.Praktikum.Percobaan1.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa[] mahasiswa = new Mahasiswa[10];
    private int mahasiswalength;

    //Constructor
    public Kelas(){

    }
    public Kelas(int kodekelas, String namakelas){
        this.kodekelas=kodekelas;
        this.namakelas=namakelas;
        this.mahasiswalength=-1;
    }
    public void setMhs (Mahasiswa mahasiswa){
        mahasiswalength++;
        this.mahasiswa[mahasiswalength]=mahasiswa;
    }
    public String getNamakelas(){
        return namakelas;
    }

    public Mahasiswa[] getMahasiswa() {
        Mahasiswa[] mahasiswas = new Mahasiswa[mahasiswalength+1];
        for (int i = 0; i <= mahasiswalength ; i++) {
            mahasiswas[i]=mahasiswa[i];
        }
        return mahasiswas;
    }
}
