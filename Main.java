/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String Name1;
        String Name2;
        
        System.out.println("Please enter your name1" );
        Name1 = scanner.nextLine();
        System.out.println("Please enter your name2" );
       Name2 = scanner.nextLine();
       
       if ((Name1.equals("Alice"))||(Name2.equals("Bob")))
       {
           System.out.println("Hello there " + Name1 + " and " + Name2);
        }
           
           
           
        else
        {
             System.out.println("No greetings" );
       
       
        
        
        

    }
}
}
