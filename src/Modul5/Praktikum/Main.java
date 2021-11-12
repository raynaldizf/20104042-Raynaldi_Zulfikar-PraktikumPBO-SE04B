package Modul5.Praktikum;

import Modul5.Praktikum.Percobaan1.Kelas.Kelas;
import Modul5.Praktikum.Percobaan1.Mahasiswa.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(1001,"Jamal");
        Mahasiswa mahasiswa2 = new Mahasiswa(1002,"Udin");
        Mahasiswa mahasiswa3 = new Mahasiswa(1003,"Alam");
        Mahasiswa mahasiswa4 = new Mahasiswa(1004,"Jumbo");

        Kelas kelasElektro = new Kelas(100,"Elektro");
        kelasElektro.setMhs(mahasiswa1);
        kelasElektro.setMhs(mahasiswa2);
        kelasElektro.setMhs(mahasiswa3);
        kelasElektro.setMhs(mahasiswa4);

        for (Mahasiswa mahasiswax : kelasElektro.getMahasiswa()){
            System.out.println(mahasiswax.getNama());
        }
        System.out.println();

        kelasElektro.setMhs(mahasiswa4);
        for (Mahasiswa mahasiswax : kelasElektro.getMahasiswa()){
            System.out.println(mahasiswax.getNama());
        }
    }
}
