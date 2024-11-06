import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai[][] = new int[4][3];

        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;
            for(int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = input.nextInt();
                totalPersiswa += nilai[i][j];
            }

            System.out.println("nilai rata rata: " + totalPersiswa / nilai[0].length);    
        }

        System.out.println("-------------------------------------");
        System.out.println("Rata rata nilai setiap mata kuliah");
        for(int i = 0; i < nilai[0].length; i++) {
            double nilaiPerMatkul = 0;
            for(int j = 0; j < nilai.length; j++) {
                nilaiPerMatkul += nilai[j][i];
            }
            System.out.println("Mata Kuliah " + (i + 1) + " Rata Rata Nilai " + nilaiPerMatkul / nilai.length);
        }
    }
}