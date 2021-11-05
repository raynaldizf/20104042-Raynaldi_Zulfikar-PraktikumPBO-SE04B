package Modul4.Tugas;

public class studentRecordExample {
    public static void main(String[] args) {
        studentRecord Wahyu = new studentRecord();
        studentRecord Ini = new studentRecord();
        studentRecord Nama = new studentRecord();

        Wahyu.setName("Wahyu");
        Ini.setName("Ini");
        Nama.setName("Nama");

        System.out.println(Wahyu.getName());
        System.out.println("Hitung = "+studentRecord.getStudentCount());
    }
}
