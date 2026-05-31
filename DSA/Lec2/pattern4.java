package Lec2;
import java.util.*;
public class pattern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int star = n;
        int space=0;
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
            row++;
            star--;
            space+=2;
        }

    }
}
