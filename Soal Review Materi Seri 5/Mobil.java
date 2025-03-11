package ti23e;

public class Mobil extends Kendaraan {
      int jumlahPintu;

    public Mobil(int jumlahPintu, String namaPemilik, String nomorPlat, String jenisKendaraan) {
        super(namaPemilik, nomorPlat, jenisKendaraan);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu Kendaraan: " + getJumlahPintu());
    }
}