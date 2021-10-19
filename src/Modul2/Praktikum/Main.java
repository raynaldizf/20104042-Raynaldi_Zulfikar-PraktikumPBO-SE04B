package Modul2.Praktikum;

import Modul2.Praktikum.protec.ModifierProtec;

public class Main {
    public static void main(String[] args) {
        //Deklarasi objek dari class Modifier
        Modifier modifier =new Modifier();

        System.out.println(modifier.angkaNone);
        System.out.println(modifier.angkaPublic);
        System.out.println(modifier.angkaProtected);

        // Private tidak bisa dipanggil, karna dibatasi nilainya
        // System.out.println(modifier.angkaPrivate);

        // Private bisa dipanggil dengan method public dalam classnya
        modifier.printAngkaPrivate();

        //Deklarasi objek baru
        ModifierProtec modifierprotec= new ModifierProtec();
        System.out.println(modifierprotec.teksPublic);
        // Tidak bisa dipanggil karena protected
        // System.out.println(modifierprotec.teksProtect);

        // Agar bisa dipanggil buat method public pemanggil
        modifierprotec.printTeksProtect();
        // Ini tidak bisa dipanggil sama sperti protected,
        // jika ingin dipanggil harus membuat method pemanggil
        // System.out.println(modifierprotec.teksNone);
    }
}
