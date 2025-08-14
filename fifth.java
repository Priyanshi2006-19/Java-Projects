//diving a number by 2 and  printing it until it becomes less than 10
import java.util.*;
public class fifth {
   public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       double n=sc.nextDouble();
       while(n>10){
       n=n/2;
           System.out.println(n);
       }
   } 
}
