package day2.java; // package is used to organize classes into namespaces, providing a way to group related classes together and avoid naming conflicts. In this case, the class Main is part of the package day2.java.
import java.util.scanner;
public class Main {
    public static void main(String[] args) {
       // user input
    System.out.println("Enter your name");
        Scanner input = new Scanner(scanner.in);
        String name=input.nextLine();
        System.out.println("Hello"+name);
        // Marks + Average
    System.out.println("Enter 4 marks");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        int n4=input.nextINT();
      int avg=(n1+n2+n3+n4)/4;// we can use double instead of int to get more accurate result
        System.out.println("The average is "+avg);  
        // Celsius to Fahrenheit
    System.out.println("ENTER the temperature in Celsius");
        double c=input.nextDouble();
        double f=(9/5)*c+32;
        System.out.println("The temperature in Fahrenheit is "+f);


    }
}