public class kalkulator{
    int tambah(int a, int b){
        return a + b;
    }

    int kurang(int a, int b){
        return a - b;
    }

    int kali(int a, int b){
        return a * b;
    }

    double bagi(double a, double b){
        if(b == 0){
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }
}