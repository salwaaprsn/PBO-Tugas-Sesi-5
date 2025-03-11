package ti23e;

        
   public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(4, "Salwa", "F12345SA", "Mobil");
        Motor motor = new Motor(true, "Aprilia", "F1811MS", "Motor");
       
        
        System.out.println("=== Informasi Kendaraan ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("===========================");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Informasi");
        int kode = sc.nextInt();
        
        if(kode==1) {
            System.out.println("Masukkan Nama Pemilik :");
                String name = sc.next();
                System.out.println("Masukkan Nomor Plat :");
                String nomor = sc.next();
                System.out.println("Masukkan Jenis Kendaraan :");
                String jenis = sc.next();
        }
        
        if(kode==2) {
            System.out.println("Masukkan Nama Pemilik :");
                String name = sc.next();
                System.out.println("Masukkan Nomor Plat :");
                String nomor = sc.next();
                System.out.println("Masukkan Jenis Kendaraan :");
                String jenis = sc.next();
        }
        
        mobil.infoKendaraan();
        motor.infoKendaraan();
        
        System.out.println("\nServiceKendaraan");
        mobil.serviceKendaraan();
        motor.serviceKendaraan("Rem");
    }
    
}
          