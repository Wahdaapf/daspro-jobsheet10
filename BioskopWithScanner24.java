import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String penonton[][] = new String[4][2];
        int baris, kolom;
        String nama, next;
        int pilihan;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // clear the newline character

            switch (pilihan) {
                case 1:
                    // Input data penonton
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();

                    // Validasi input untuk baris dan kolom
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input.nextInt();
                        input.nextLine(); // clear the newline character

                        // Cek apakah baris dan kolom valid
                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            // Simpan nama penonton di kursi yang dipilih
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                break; // Keluar dari loop validasi setelah input berhasil
                            } else {
                                System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Posisi baris atau kolom tidak valid. Silakan masukkan ulang.");
                        }
                    }

                    System.out.print("Input penonton lainya? (y/n): ");
                    next = input.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;

                case 2:
                    // Tampilkan daftar penonton
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("[***] ");
                            } else {
                                System.out.print("[" + penonton[i][j] + "] ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
