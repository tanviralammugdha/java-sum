/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author MY PC
 */
 import java.util.Scanner;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Scanner sc= new Scanner (System.in);
  System.out.print("Enter the lenth :");
  int a =sc.nextInt();
  System.out.print("enter the width:");
  int b =sc.nextInt();
  int area=a*b;
  System.out.println("the ans is "+area);
    }
    
}
