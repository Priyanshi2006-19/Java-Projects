// elements of arrays
import java.util.*;
public class first {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
        array[i]=(i+1)*10;
            System.out.println(array[i]);
        }
    }
    
}
