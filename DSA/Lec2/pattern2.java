package Lec2;
import java.util.*;
public class pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        int star=1;
        while(i<num){
            int j=0;
            while(j<star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
            star++;
        }
    }
}