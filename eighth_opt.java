// sum of even numbers upto n
import java.util.*;
public class eighth_opt {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the end value of series: ");
       int n=sc.nextInt();
        System.out.println("Even numbers between 1 to "+n+" are: ");
       for(int i=1;i<=n;i++){
       if(i%2==0){
           System.out.println(i);
       }
       }
    }
}
