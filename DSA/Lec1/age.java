import java.util.*;
public class age {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Not Eligible for Age");
        }
        else{
            System.out.println("Eligible for the Age");
        }
    }
    
}
