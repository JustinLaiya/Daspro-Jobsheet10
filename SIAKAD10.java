import java.util.Scanner;

public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah:" );
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalperSiswa = 0;

            for (int j = 0; j < nilai[i].length;j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalperSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata untuk mahasiswa ke-" + (i + 1) + ": " + / jumlahMataKuliah);
        }
        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah : ");
        for(int j = 0;j<3;j++){
            double jumlahPerMatkul=0;
            for(int i=0;i<4;i++){
                jumlahPerMatkul+=nilai[i][j];
            }
            System.out.println("  Mata kuliah "+ (j+1) + ": "+ jumlahPerMatkul/jumlahSiswa);
        }
    }
    
}
