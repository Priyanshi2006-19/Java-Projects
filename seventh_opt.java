// using nested loop
public class seventh_opt {
    public static void main(String[] args) {
        int a = 10;
        int b = 78;
        int c = 5;
        int d = 2;

        if (a < b) {
            if (a < c) {
                if (a < d) {
                    System.out.println(a + " is the smallest");
                } else {
                    System.out.println(d + " is the smallest");
                }
            } else {
                if (c < d) {
                    System.out.println(c + " is the smallest");
                } else {
                    System.out.println(d + " is the smallest");
                }
            }
        } 
        else { // b <= a
            if (b < c) {
                if (b < d) {
                    System.out.println(b + " is the smallest");
                } else {
                    System.out.println(d + " is the smallest");
                }
            } else {
                if (c < d) {
                    System.out.println(c + " is the smallest");
                } else {
                    System.out.println(d + " is the smallest");
                }
            }
        }
    }
}
