// leap year
import java.util.*;
public class nine_opt {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year : ");
        int yr=sc.nextInt();
        if(yr%400==0){
            System.out.println(yr+" is a leap year");
        }
        else if(yr%4==0 && yr%100!=0){
            System.out.println(yr+" is a leap year");
        }
        else{
            System.out.println(yr+" is not a Leap year");
        }
    }
}
