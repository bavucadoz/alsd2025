package CM02;

public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = hargaTotal();
    }

    // hitung harga total bbm
    public double hargaTotal() {
        return bbm.hargaPerLiter * liter;
    }

    // tampil transaksi
    public void tampilkanTransaksi() {
        System.out.print(kendaraan.platNomor + ": Rp " + totalBayar);
    }
}