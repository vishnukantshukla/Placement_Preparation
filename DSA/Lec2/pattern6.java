package Lec2;

import java.util.Scanner;

public class pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int star=1;
        int space=n-1;
        while(row<n){
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                if(k%2!=0){
                    System.out.print("! ");
                }
                else{
                    System.out.print("* ");
                }
                k++;

            }
            System.out.println();
            star+=2;
            space--;
            row++;

        }
    }
}
