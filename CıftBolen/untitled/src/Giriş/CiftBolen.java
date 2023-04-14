package Giriş;

import java.util.Scanner;

public class CiftBolen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Sayı Girin: ");
        n = input.nextInt();

        int total = 0;
        do {
            for (int f = 1; f <= n; n--) {
                if ((n % 2 == 0) && (n % 4 == 0)) {
                    total = total + n;
                }
            }
        }
        while ((n > 0) && (n % 2 == 0));
        System.out.print(total);

    }
}
