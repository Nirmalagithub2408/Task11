import java.util.Scanner;

public class Ageexception {
   
    public static void main(String[] args) {
       
       try {
        int age = readage();
        System.out.println("age:  ");}
        catch ( IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    private static int readage() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int age = scanner.nextInt();
        if(age<18)
        {
            throw new IllegalArgumentException(age + " is not eligible age to vote");
        }
return age ;
    }
    
}
