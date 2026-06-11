package Lec2;

import java.util.*;

public class pattern10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n / 2 + 1;
        int space = -1;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < star) {
                System.out.print("* ");
                j++;
            }
            int k = 0;
            while (k < space) {
                System.out.print("  ");
                k++;
            }
            int l = 0;
            if (i == 0 || i == n - 1) {
                l = 1;
            }
            while (l < star) {
                System.out.print("* ");
                l++;
            }
            if (i + 1 >= n / 2 + 1) {
                star++;
                space -= 2;
            } else {
                star--;
                space += 2;
            }
            i++;

            System.out.println();

        }

    }

}
