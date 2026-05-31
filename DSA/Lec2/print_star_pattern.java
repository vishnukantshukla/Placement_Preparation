package Lec2;

import java.util.Scanner;

public class print_star_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int i=0;
        while(i<num){
            System.out.print("*");
            i++;
        }
    }
}
