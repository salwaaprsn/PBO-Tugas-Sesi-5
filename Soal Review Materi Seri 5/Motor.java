package ti23e;

public class Motor extends Kendaraan {
    boolean memilikiBox;

    public Motor(boolean memilikiBox, String namaPemilik, String nomorPlat, String jenisKendaraan) {
        super(namaPemilik, nomorPlat, jenisKendaraan);
        this.memilikiBox = memilikiBox;
    }

    public String isMemilikiBox() {
        String keterangan;
        if(memilikiBox){
            keterangan = "YA";
        }else
            keterangan = "TIDAK";
        return keterangan;
    }

    public void setMemilikiBox(boolean memilikiBox) {
        this.memilikiBox = memilikiBox;
    }
    
    @Override
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Memiliki Box: " + isMemilikiBox());
    }
}