import java.util.Scanner;

public class maximum_of_three_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is greater then b and c");
        }
        else if(b>=c && b>=a){
            System.out.println("b is greater then a and c");
        }
        else{
            System.out.println("c is greater then a and b");
        }

    }
}
