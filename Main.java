import java.util.ArrayList;
import java.util.List;
import uts_pbo.InputHandler;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        List<MakananUtama> menuMakanan = new ArrayList<>();
        List<Minuman> menuMinuman = new ArrayList<>();
        List<MenuItem> pesanan = new ArrayList<>();
        
        // Tambahkan menu makanan
        menuMakanan.add(new MakananUtama("Nasi Goreng", 20000));
        menuMakanan.add(new MakananUtama("Mie Goreng", 18000));
        menuMakanan.add(new MakananUtama("Nasi Ayam", 20000));
        menuMakanan.add(new MakananUtama("Nasi Ommelette", 15000));

        // Tambahkan menu minuman
        menuMinuman.add(new Minuman("Es Teh", 8000));
        menuMinuman.add(new Minuman("Kopi", 12000));
        menuMinuman.add(new Minuman("Jus Jeruk", 15000));
        menuMinuman.add(new Minuman("Milkshake", 20000));

        boolean selesai = false;

        while (!selesai) {
            System.out.println("\n--- Rumah Makan Ojolali ---");
            System.out.println("1. Tampilkan Menu Makanan");
            System.out.println("2. Tampilkan Menu Minuman");
            System.out.println("3. Tambah Pesanan");
            System.out.println("4. Tampilkan Pesanan");
            System.out.println("5. Hitung Total Bayar");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = inputHandler.scanner.nextInt();

            switch (pilihan) {
                case 1: // Tampilkan menu makanan
                    System.out.println("\nMenu Makanan:");
                    for (int i = 0; i < menuMakanan.size(); i++) {
                        MakananUtama item = menuMakanan.get(i);
                        System.out.println((i + 1) + ". " + item.getNama()  + " - Rp " + item.getHarga());
                    }
                    break;

                case 2: // Tampilkan menu minuman
                    System.out.println("\nMenu Minuman:");
                    for (int i = 0; i < menuMinuman.size(); i++) {
                        Minuman item = menuMinuman.get(i);
                        System.out.println((i + 1) + ". " + item.getNama() + " - Rp " + item.getHarga());
                    }
                    break;

                case 3: // Tambah pesanan
                    System.out.println("\nPilih jenis menu:");
                    System.out.println("1. Makanan");
                    System.out.println("2. Minuman");
                    System.out.print("Masukkan pilihan (1/2): ");
                    int jenisMenu = inputHandler.scanner.nextInt();

                    if (jenisMenu == 1) {
                        System.out.println("\nMenu Makanan:");
                        for (int i = 0; i < menuMakanan.size(); i++) {
                            MakananUtama item = menuMakanan.get(i);
                            System.out.println((i + 1) + ". " + item.getNama());
                        }
                        System.out.print("Masukkan nomor makanan: ");
                        int nomorMakanan = inputHandler.scanner.nextInt();

                        if (nomorMakanan > 0 && nomorMakanan <= menuMakanan.size()) {
                            MakananUtama makanan = menuMakanan.get(nomorMakanan - 1);
                            double topping = inputHandler.pilihTopping();
                            makanan.setTopping(topping);
                            pesanan.add(makanan);
                            makanan.persiapkan();
                            System.out.println("Pesanan " + makanan.getNama() + " ditambahkan.");
                        } else {
                            System.out.println("Nomor makanan tidak valid.");
                        }
                    } else if (jenisMenu == 2) {
                        System.out.println("\nMenu Minuman:");
                        for (int i = 0; i < menuMinuman.size(); i++) {
                            Minuman item = menuMinuman.get(i);
                            System.out.println((i + 1) + ". " + item.getNama());
                        }
                        System.out.print("Masukkan nomor minuman: ");
                        int nomorMinuman = inputHandler.scanner.nextInt();

                        if (nomorMinuman > 0 && nomorMinuman <= menuMinuman.size()) {
                            Minuman minuman = menuMinuman.get(nomorMinuman - 1);
                            String ukuran = inputHandler.pilihUkuran();
                            minuman.setUkuran(ukuran);
                            String kemanisan = inputHandler.pilihKemanisan();
                            minuman.setKemanisan(kemanisan);
                            pesanan.add(minuman);
                            minuman.persiapkan();
                            System.out.println("Pesanan " + minuman.getNama() + " ditambahkan.");
                        } else {
                            System.out.println("Nomor minuman tidak valid.");
                        }
                    } else {
                        System.out.println("Pilihan jenis menu tidak valid.");
                    }
                    break;

                case 4: // Tampilkan pesanan
                    System.out.println("\nDaftar Pesanan:");
                    if (pesanan.isEmpty()) {
                        System.out.println("Tidak ada pesanan.");
                    } else {
                        for (int i = 0; i < pesanan.size(); i++) {
                            MenuItem item = pesanan.get(i);
                            System.out.println((i + 1) + ". " + item.getNama() + " - Rp " + item.hitungHarga());
                        }
                    }
                    break;

                case 5: // Hitung total bayar
                    double total = 0;
                    for (MenuItem item : pesanan) {
                        total += item.hitungHarga();
                    }
                    for (int i = 0; i < pesanan.size(); i++) {
                            MenuItem item = pesanan.get(i);
                            System.out.println((i + 1) + ". " + item.getNama() + " - Rp " + item.hitungHarga());
                        }
                    System.out.println("\nTotal Bayar: Rp " + total);
                    break;

                case 6: // Keluar
                    selesai = true;
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
