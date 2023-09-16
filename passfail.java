/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author MY PC
 */
import java.util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Scanner sc= new Scanner(System.in);
       System.out.print("enter the mark :");
       int mark= sc.nextInt();
       if(mark>=40 &&mark<=100){
       System.out.print("pass");
       
       }
       else if(mark<100) {
           
System.out.print("wrong number");
       }
       else{
       System.out.print("fail");
       }
       
        
        
        
    }
    
}
