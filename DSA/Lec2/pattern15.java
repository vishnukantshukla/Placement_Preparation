package Lec2;

import java.util.Scanner;

public class pattern15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int star=1;
        int space=n-1;
        int val=1;
        int temp=val;
        while(i<(n*2)-1){
            int j=0;
            val=temp;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                System.out.print(val+" ");
                if(k>=star/2){
                    val--;
                }
                else{
                    val++;
                }
                k++;
            }
            if(i>=n-1){
                star-=2;
                space++;
            }
            else{
                star+=2;
                space--;
            }
            if(i>=n-1){
                temp--;
            }
            else{
                temp++;
            }
            i++;


            System.out.println();
        }
    }
}
