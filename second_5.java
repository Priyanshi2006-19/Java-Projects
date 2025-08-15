//sum of all array elements
import java.util.*;
public class second_5 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int [] array = new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();}
        System.out.println("Sum of array elements : ");
            for(int i=0;i<size;i++){
        sum=sum+array[i];
        }
        System.out.println(sum);
    }
    
}
