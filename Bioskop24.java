public class Bioskop24 {
    public static void main(String[] args) {
        String penonton[][] = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "eka";
        penonton[2][1] = "farhan";
        penonton[3][0] = "gsel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);

        for(int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke " + (i+1) + " adalah " + penonton[i].length);
        }

        for(String[] temp : penonton) {
            System.out.println("panjang baris " + temp.length);
        }

        System.out.println();
        System.out.println("Penonton Baris ke 3");
        for(int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        System.out.println();
        System.out.println("Penonton Baris ke 3");
        for(String i: penonton[2]) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("");
        for(int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke " + (i+1) + " : " + String.join(", ", penonton[i]));
        }
    }
}