import java.util.Scanner;
public class Main.java {
    public static void main(String[] args) {
       // 1. User input
    System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Hello"+name);
        // 2. Marks + Average
    System.out.println("Enter 4 marks");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        int n4=input.nextInt();
      int avg=(n1+n2+n3+n4)/4;// we can use double instead of int to get more accurate result
        System.out.println("The average is "+avg);  
        // 3. Celsius to Fahrenheit    
    System.out.println("ENTER the temperature in Celsius");
        double c=input.nextDouble();
        double f=(9.0/5.0)*c+32;
        System.out.println("The temperature in Fahrenheit is "+f);
        // 4.Area of Circle
        System.out.println("Enter the radius of the circle");
        double radius=input.nextDouble();
        final double PI=3.14;
        double a = PI * radius * radius;
        System.out.println("The area of the circle is "+a); 
       // 5. Sum of Digits (for 3 digits)
        System.out.println("Enter a number");
        int num=input.nextInt();//123
        int tempnum=num;//123// we can use tempnum instead of num to keep the original number for later use
        int sum=0;
        sum=tempnum%10;//3
        tempnum/=10;//2
        sum=sum+tempnum%10;//5
        tempnum/=10;//1
        sum=sum+tempnum%10;//6
        System.out.println("The sum of the digits is "+sum);

     input.close(); // إغلاق السكنر


       
      
        
        
    
}
}