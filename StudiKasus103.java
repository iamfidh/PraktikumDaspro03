import java.util.Scanner;

public class StudiKasus103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.println("Masukkan uang pembayaran: Rp.");
        uangBayar = input.nextInt();

        
        input.close();
    }
}
