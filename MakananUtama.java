public class MakananUtama extends MenuItem {
    private double biayaTopping;

    public MakananUtama(String nama, double harga) {
        super(nama, harga);
        this.biayaTopping = 0; // Default tanpa topping
    }

    public void setTopping(double biayaTopping) {
        this.biayaTopping = biayaTopping;
        
    }

    @Override
    public double hitungHarga() {
        return getHarga() + biayaTopping;
    }

    @Override
    public void persiapkan() {
        System.out.println("Memasak " + getNama() + " dengan topping.");
    }
}
