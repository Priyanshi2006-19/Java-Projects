// largest element among given array
import java.util.*;
public class seventh_5 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
        }
        int big=array[0];
        for(int i=1;i<size;i++){
        if(array[i]>big){
            big = array[i];
        }  
        }
        System.out.println("Largest element among all elements of array is "+big);
    }
}
