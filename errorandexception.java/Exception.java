public class Exception {
    public static void main(String args[]) {
        int a, b,c;
        try {
           a = 51;
           b = 0;
           c=a/b;
           System.out.println("c is " +c);
        } catch (ArithmeticException e) {
           System.out.println("you cannot divide a number with zero");
        }
     } 
}
