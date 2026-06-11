package Lec2;
import java.util.*;
public class pattern13 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int space = n-1;
        int star=1;
        int val=0;
        while(i<n){
            int j=0;
            val=1;
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
            System.out.println();
            i++;
            star+=2;
            space--;
        }

    }
}
