// Remainder and quotient
import java.util.*;
public class fourth_3 {
   public static void main(String [] args){
   Scanner sc=new Scanner (System.in);
       System.out.println("Input the first number");
        int a=sc.nextInt();
        System.out.println("Input the second number");
         int b=sc.nextInt();
         int rem=a%b;
         int quot=a/b;
         System.out.println("Remainder of numbers is : "+rem);
         System.out.println("Quotient of numbers is : "+quot);
   }
}
