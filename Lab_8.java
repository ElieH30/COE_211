
package practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner ;

public class Lab_8 {
    static String Name;
    static String Product;
    static Double price;
    
    
    public static void log (){
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Imput your name: ");
        Name = scan.next();
       
       System.out.println("What did you purchase? " );
       Product = scan.next();
    
       System.out.println("How much did you pay? (In USD) " );
       price = scan.nextDouble();
    }
    
    public static void main (String []args) throws IOException {
       Scanner scan = new Scanner(System.in);
        File file = new File("expenses.txt");
       FileWriter fr = new FileWriter(file, true);
      log () ;
       
      String data = Name + " purchased " + Product + " for " + price + " US Dollars.";
       fr.write(data);
       fr.close();
       
       System.out.println("“Would you like to log another purchase? (y/n) ");
       
       
       String choice = scan.next();
       if ( choice == "y") {
           log();
        }
       else {
           System.exit(1);
       }
    }
    
}