// smallest using if else if ... else
public class seventhEasy_opt {
 public static void main(String [] args){
  int a=12;
  int b=34;
  int c=7;
  int d=8;
  if (a < b && a < c && a < d) {
            System.out.println(a + " is the smallest");
        }
        else if (b < a && b < c && b < d) {
            System.out.println(b + " is the smallest");
        }
        else if (c < a && c < b && c < d) {
            System.out.println(c + " is the smallest");
        }
        else {
            System.out.println(d + " is the smallest");
        } 
 }
}
