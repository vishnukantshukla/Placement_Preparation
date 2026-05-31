package Lec2;

import java.util.Scanner;

public class pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int space= n-1;
        int star=1;
        while(row<n){
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            star+=2;
            space--;
            row++;
        }
    }
}
