package CM02;

public class Kendaraan {
    String platNomor;
    String tipe;
    String merk;
    Kendaraan next;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
        this.next = null;
    }

    // tampil info kendaraan
    public void tampilkanInformasi() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
        System.out.println();
    }
}
