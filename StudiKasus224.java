import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner ostha = new Scanner(System.in);
        
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, syaratDokumen;
        boolean status;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = ostha.nextLine();
        System.out.print("Jenis kegiatan(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = ostha.nextLine();
        System.out.print("jumlah dokumen : ");
        jumlahDokumen = ostha.nextInt();
       
        if (jumlahDokumen == 4) {
            if (jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Belmawa") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                System.out.print("peringkat juara: ");
                peringkat = ostha.nextInt();
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Pendanaan diberikan karena memenuhi syarat");
                } else {
                    System.out.println("Status : Pendanaan tidak diberikan karena tidak juara");
                }
            } else {
            }
        } else {
            syaratDokumen = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + syaratDokumen + " dokumen). Dana penghargaan tidak diberikan.");
        }
    }
}
        