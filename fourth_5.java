//sum of series
import java.util.*;
public class fourth_5 {
   public static void main(String [] args){
    Scanner sc=new Scanner (System.in);
       System.out.println("Enter the end value of series: ");
       int n=sc.nextInt();
       double sum=0.0;
       for(int i=1;i<=n;i++){
        sum+=1.0/i;
       }
       System.out.println("Sum of series is : "+sum);
   } 
}
