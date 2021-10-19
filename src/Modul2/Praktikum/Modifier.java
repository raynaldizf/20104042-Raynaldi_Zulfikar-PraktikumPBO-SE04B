package Modul2.Praktikum;

public class Modifier {
    int angkaNone=1;
    public int angkaPublic=10;
    private int angkaPrivate=100;
    protected int angkaProtected=1000;

    public void printAngkaPrivate(){
        System.out.println(angkaPrivate);
    }
}