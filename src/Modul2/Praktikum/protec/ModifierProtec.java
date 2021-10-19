package Modul2.Praktikum.protec;

public class ModifierProtec {
    String teksNone="Ini None !";
    public String teksPublic="Ini Public Access !";
    protected String teksProtect="Ini Protect Access !";

    public void printTeksProtect(){
        System.out.println(teksProtect);
    }
}
