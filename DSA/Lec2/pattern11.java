package Lec2;
import java.util.*;
public class pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = n/2;
        int space1=-1;
        int star=1;
        int i=0;
        while(i<n){
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            System.out.print("* ");
            int k=0;
            
            while(k<space1){
                System.out.print("  ");
                k++;
            }
            if(i!=0 && i!=n-1){
                System.out.print("* ");
            }
            System.out.println();
            if(i>=n/2){
                space++;
                space1-=2;
            }
            else{
                space--;
                space1+=2;
            }
            i++;
            
        }
    }
}
