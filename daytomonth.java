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
  System.out.print("Enter the day :");
int day=sc.nextInt();
int month =day/30;
int newDay=day-(month*30);

System.out.println(day+"   day is equal to"+month  +"  month and "+newDay+"  day");
    }
    
}
