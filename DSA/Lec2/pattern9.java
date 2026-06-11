package Lec2;

import java.util.Scanner;

public class pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int star =n;
        int space =n-1;
        int i=0;
        while(i<n*2-1){
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
            i++;
            if(i>=n){
                star++;
                space++;
            }
            else{
                star--;
                space--;
            }
            
            System.out.println();
        }

    }
}
