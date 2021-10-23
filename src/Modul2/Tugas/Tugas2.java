package Modul2.Tugas;

public class Tugas2 {
    public static void main(String[] args) {
        for (int i = 10; i > 1 ; i--) {
            System.out.println("Anak ayam Turun " + i);
            i-=1;
            System.out.println("Mati Satu Tinggal " + i);
            if (i==1){
                System.out.println("Anak ayam turun "+ i);
                System.out.println("Mati 1 tinggal induknya");
            }
        }
    }
}
