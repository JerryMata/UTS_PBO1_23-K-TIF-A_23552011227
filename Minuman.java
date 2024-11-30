public class Minuman extends MenuItem {
    private String ukuran;
    private String kemanisan;

    public Minuman(String nama, double harga) {
        super(nama, harga);
        this.ukuran = "sedang"; // Default ukuran
        this.kemanisan = "normal";
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran.toLowerCase();
    }
    public void setKemanisan(String kemanisan) {
        this.kemanisan = kemanisan.toLowerCase();
    }

    @Override
    public double hitungHarga() {
        switch (ukuran) {
            case "kecil":
                return getHarga() * 0.75;
            case "besar":
                return getHarga() * 1.5;
            default: // Default adalah "sedang"
                return getHarga();
        }
    }

    @Override
    public void persiapkan() {
        System.out.println("Menyiapkan minuman " + getNama() + " ukuran " + ukuran + ".");
    }
}
