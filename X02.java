// 12S24052 - Indah Triyuni Siahaan
// 12S24007 - Dasmauli Sormin

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];

        fungsi1(nama);
        fungsi2(nama);
    }
    
    public static void fungsi1(String[] nama) {
        int a;

        for (a = 0; a <= 3; a++) {
            nama[a] = "";
        }
    }
    
    public static void fungsi2(String[] nama) {
        int b, c;

        for (b = 0; b <= 3; b++) {
            nama[b] = input.nextLine();
            if (nama[b].equals("---")) {
                nama[b] = "";
                c = b;
                b = 4;
            } else {
                c = b;
            }
        }
        fungsi3(nama);
    }
    
    public static void fungsi3(String[] nama) {
        int d;

        for (d = 0; d <= 3; d++) {
            System.out.println(nama[d]);
        }
    }
}
