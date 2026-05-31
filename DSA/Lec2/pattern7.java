package Lec2;

import java.util.Scanner;

public class pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int space = 2*n-3;
        int star=1;
        while(row<n){
            int j=0;
            while(j<star){
                System.out.print("* ");
                j++;
            }
            int k=0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            int l=0;
            if(row==n-1){
                l=1;
            }
            while(l<star){
                System.out.print("* ");
                l++;
            }
            System.out.println();
            row++;
            star++;
            space-=2;
        }
    }
}
