import java.util.Scanner;

public class CekNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        // Cek lulus atau tidak
        if (nilai >= 60) {
            System.out.println("Hasil: Lulus");
        } else {
            System.out.println("Hasil: Tidak Lulus");
        }

        // Tentukan grade
        String grade;
        if (nilai >= 85 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else if (nilai >= 0) {
            grade = "E";
        } else {
            grade = "Nilai tidak valid";
        }

        System.out.println("Grade: " + grade);
        input.close();
    }
}
