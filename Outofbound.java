public class Outofbound {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String s = "example";
try {
    int x = numbers[5]; // this will throw an ArrayIndexOutOfBoundsException
    System.out.println("Index is " +x);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Error: Index is out of bounds.");

}
try {  
    String substring = s.substring(2, 8); // throws StringIndexOutOfBoundsException  
} catch (StringIndexOutOfBoundsException e) {  
    // catch the exception and log an error message  
    System.err.println("String index is out of bounds: " + e.getMessage());  

}      
    }
    
}
