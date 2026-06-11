package Lec2;
import java.util.*;
public class pattern12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space =n-1;
        int star=1;
        int i=0;
        int val=1;
        while(i<n){
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                System.out.print(val+" ");
                val++;
                k++;
            }
            i++;
            System.out.println();
            star+=2;
            space--;
        }

    }
}
