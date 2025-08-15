//Palindrome
import java.util.*;
public class nine_5 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is Palindrome: ");
        int n=sc.nextInt();
        int reverse=0;
        int original=n;
        while(n!=0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
        }
        if(original==reverse){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
