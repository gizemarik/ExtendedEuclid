import java.math.*; 
import java.util.Scanner; 

public class ModularExponentiation { 
	
 public static void main(String[] args) 
 { 

     // Create 3 BigInteger objects 
     BigInteger number1, number2, result, exponent; 
     Scanner scn = new Scanner(System.in); 

     System.out.println("Enter the first number : ");
     number1 = scn.nextBigInteger();  
     
     System.out.println("Enter the second number : ");
     number2 = scn.nextBigInteger(); 
     
     System.out.println("Enter the exponent number : ");
     exponent = scn.nextBigInteger(); 
 

     // Perform modPow operation on the objects and exponent 
     result = number1.modPow(exponent, number2); 
     String expression = number1 + "^" + exponent + "mod("+ number2 + ") = " + result; 

     // Displaying the result 
     System.out.println(expression); 
 } 
} 