package Modul2.Praktikum;
import Modul2.Praktikum.protec.ModifierSubCLass;

public class MainSub extends ModifierSubCLass {
    public static void main(String[] args) {
        MainSub mainsub= new MainSub();

        System.out.println(mainsub.teksPublic);
        System.out.println(mainsub.teksProtect);
        // Tidak bisa karena private access
        // System.out.println(mainsub.teksPrivate);
        // System.out.println(mainsub.teksNone);
    }
}
