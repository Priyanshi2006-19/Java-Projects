//  sum of series
import java.util.*;
public class fourth {
    public static void main(String [] args){
    Scanner sc=new Scanner (System.in);
        System.out.println("Enter the end value of series :");
     int n=sc.nextInt();
     int sum=0;
        for(int i=1;i<=n;i++){
        sum=sum+i;
        }
        System.out.println("Sum of the series till "+n+" is: "+sum);
    }
}
