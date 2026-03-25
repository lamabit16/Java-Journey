// Message box (GUI) Graphic user interface النوع الثاني من شكل ال output

// بستخدمها ل ظهور ال output في شكل نافذة منبثقة
// JOptionPane --> name of class
// method --> function inside a 

// convemtion API 
// name of class --> start with capital letter
// name of method --> start with small letter and then camel case
package day3;
import java.util.Scanner;// OR // import javax.swing.JOptionPane; --> to use the JOptionPane class only
import javax.swing.*;// to use the Scanner class for console input  

public class day3 {
    public static void main(String[] args) {
JOptionPane.showMessageDialog(null,"hellow");
// null --> to make the message box appear in the center of the screen
// "hellow" --> the message that will be displayed in the message box
// showMessageDialog --> method that is used to display a message box
int w=10;
JOptionPane.showMessageDialog(null,"The value of w is "+w);

//////////////////////////////////

// Input 
// 1. ON console
// 2. ON message box GUI
// console input --> Scanner class
Scanner s=new Scanner(System.in);
System.out.println("Enter your score: ");
int score=s.nextInt();
score=score+10;
System.out.println("Your score is "+score);








    }
}