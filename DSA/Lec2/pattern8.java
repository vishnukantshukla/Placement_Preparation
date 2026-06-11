package Lec2;

import java.util.Scanner;

public class pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        print_triangle(n);

    }
    public static void print_triangle(int n){
        int i=0;
        int star=1;
        while(i<n*2-1){
            int j=0;
            while(j<star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
           
            if(i+1>=n){
                star--;
            }
            else{
                star++;
            }
            i++;

        }
    }
}
