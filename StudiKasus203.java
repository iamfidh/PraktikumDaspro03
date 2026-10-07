import java.util.Scanner;

public class StudiKasus203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, jenisKegiatan;
        int jmlDokumen, peringkat, statusPKM;
        int juara;

        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/lainnya): ");
        jenisKegiatan = input.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen: ");
        jmlDokumen=input.nextInt();

        if (jenisKegiatan.equals("BELMAWA")||jenisKegiatan.equals("BAKORMA")||jenisKegiatan.equals("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            juara = input.nextInt();
            if (juara >= 1 && juara <= 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Status: Dana penghargaan diberikan.");
                }else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang "+(4-jmlDokumen)+" dokumen). Dana penghargaan tidak diberikan.");
                }
            }else{
                    System.out.println("Status: Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        }
        input.close();
    }
}
