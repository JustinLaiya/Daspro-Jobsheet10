import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris,kolom;
        String nama,next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("Kursi sudah terisi, pilih kursi lain.");
                    }
                } else {
                    System.out.println("Nomor baris/kolom tidak valid.");
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                // Menu 3: Exit
                System.out.println("Terima kasih");
                break;
            } else {
                System.out.println("Tidak valid, silahkan coba lagi.");
            }
            
        }
    }
}
