public class Perulangan {
    public static void main(String[] args) {
        // Perulangan for: Menampilkan bilangan genap dari 2 sampai 10
        System.out.println("Perulangan for - Bilangan Genap:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Bilangan genap: " + i);
        }

        // Perulangan while: Menampilkan bilangan ganjil dari 1 sampai 9
        System.out.println("\nPerulangan while - Bilangan Ganjil:");
        int j = 1;
        while (j <= 9) {
            System.out.println("Bilangan ganjil: " + j);
            j += 2;
        }
    }
}
