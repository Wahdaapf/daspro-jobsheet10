import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respondents = 10;
        int questions = 6;
        int[][] surveyResults = new int[respondents][questions];

        // a. Mengisi hasil survei
        System.out.println("Masukkan hasil survei (nilai 1-5) untuk setiap responden:");
        for (int i = 0; i < respondents; i++) {
            System.out.println("Responden " + (i + 1) + ": ");
            for (int j = 0; j < questions; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                surveyResults[i][j] = scanner.nextInt();
                if (surveyResults[i][j] < 1 || surveyResults[i][j] > 5) {
                    System.out.println("Nilai harus antara 1 dan 5. Silakan ulangi.");
                    j--; // ulangi input untuk pertanyaan yang sama
                }
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nNilai rata-rata untuk setiap responden:");
        for (int i = 0; i < respondents; i++) {
            int sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += surveyResults[i][j];
            }
            double average = (double) sum / questions;
            System.out.printf("  Responden %d: %.2f%n", (i + 1), average);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nNilai rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < questions; j++) {
            int sum = 0;
            for (int i = 0; i < respondents; i++) {
                sum += surveyResults[i][j];
            }
            double average = (double) sum / respondents;
            System.out.printf("  Pertanyaan %d: %.2f%n", (j + 1), average);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        int totalSum = 0;
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                totalSum += surveyResults[i][j];
            }
        }
        double overallAverage = (double) totalSum / (respondents * questions);
        System.out.printf("\nNilai rata-rata keseluruhan: %.2f%n", overallAverage);

        scanner.close();
    }
}
