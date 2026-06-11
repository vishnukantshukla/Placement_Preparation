package Lec2;
import java.util.*;
public class pattern14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int star=1;
        int space=n-1;
        int val=1;
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
                if(k>=star/2){
                    val--;
                }
                else{
                    val++;
                }
                k++;
            }
            i++;
            star+=2;
            space--;
            System.out.println();
        }
    }
}
