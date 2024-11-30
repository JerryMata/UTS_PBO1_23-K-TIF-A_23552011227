import java.util.Scanner;

public class InputHandler {
    Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Menanyakan ukuran minuman
    public String pilihUkuran() {
        System.out.println("Pilih ukuran minuman:");
        System.out.println("1. Kecil ");
        System.out.println("2. Sedang ");
        System.out.println("3. Besar ");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                return "kecil";
            case 3:
                return "besar";
            default:
                return "sedang"; // Default ukuran
        }
    }
    public String pilihKemanisan() {
            System.out.println("Kemanisan?");
            System.out.println("1. Less");
            System.out.println("2. Normal");
            System.out.println("3. Double ");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                return "less";
            case 3:
                return "double";
            default:
                return "normal"; // Default kemanisan
        }
    }
            

    // Menanyakan topping untuk makanan utama
    public double pilihTopping() {
        System.out.println("Pilih topping:");
        System.out.println("1. Tidak ada topping (default)");
        System.out.println("2. Topping keju (+Rp 5000)");
        System.out.println("3. Topping sosis (+Rp 7000)");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 2:
                return 5000; // Biaya topping keju
            case 3:
                return 7000; // Biaya topping sosis
            default:
                return 0; // Tanpa topping
        }
    }
}

