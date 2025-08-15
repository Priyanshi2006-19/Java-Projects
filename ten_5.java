//decimal to hexadecimal
import java.util.*;
public class ten_5 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be converted in hexadcimal: ");
        int n=sc.nextInt();
        String s="";
        while(n!=0){
        int r=n%16;
            n=n/16;
            if(r<10){
            s=r+s;}
            else if(r==10){
                s='A'+s;
                 }
            else if (r==11){
            s='B'+s;
            }
            else if(r==12){
            s='C'+s;
            }
            else if(r==13){
            s='D'+s;
            }
            else if(r==14){
            s='E'+s;
            }
            else if(r==15){
            s='F'+s;
            }
            else{
                System.out.println("Invalid number");
            }
            }
        System.out.println("Hexadecimal number is:"+s);
        }
    }

