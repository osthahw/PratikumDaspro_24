import java.util.Scanner;

public class StudiKasus124 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);
        
        int hargaPerCup = 15000; 
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = ostha.nextInt();
        System.out.print("Masukkan uang bayar  : ");
        uangBayar = ostha.nextInt();
        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        
        if (totalHarga >= 120000) {
            diskon = totalHarga * 5 / 100; 
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total bayar          : Rp " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian            : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        } 
    }
}
