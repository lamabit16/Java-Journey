

public class Introduction {
    public static void main(String[] args){
       System.out.print("Welcom to Java");
       // constant variable
       // final variable we use capital letter
       final double PI = 3.14;
       int r=10;
       double a=PI*r*r;
       System.out.println("Area of circle is "+a);
       //////////////////////////////////////////
       // Swap two numbers
       int x,y,temp;
        x=10;
        y=50;
        System.out.println("Before swap x="+x+" y="+y);  
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swap x="+x+"y="+y);
        ////////////////////////////////////////
        // rectangle area
        int l=20;
        int w=10;
        int area=l*w;
        System.out.println("THE area of rectangle is "+area);
    
    }
}