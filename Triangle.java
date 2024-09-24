/******************************************************************************
 * Nafn : Ma. Kathy Carissa Jamora Todtod
 * T-póstur: mkc4@hi.is
 *
 * Lýsing :
 * Prints a triangular pattern based on a given number n.
 *
 *
 *****************************************************************************/

 import java.util.Scanner;

 public class Triangle {
 
     public static void main(String[] args) {
       
 
         // Create scanner to read input
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number (1 to 9): ");
         int n = scanner.nextInt();
 
         // Outer loop to control the number of lines
         for (int i = n; i >= 1; i--) {
             // Print the decreasing part
             for (int j = i; j >= 1; j--) {
                 System.out.print(j);
             }
 
             for (int j = 2; j <= i; j++) {
                 System.out.print(j);
             }
 
             System.out.println();
         }
     }
 }