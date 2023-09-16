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
        System.out.print("enter the first number  :");
        int a= sc.nextInt();
        System.out.print("enter the second number  :");
        int b= sc.nextInt();
        if(a>b){
        System.out.print("big number is :"+a);
        }
        else{
        System.out.print(" big number is:"+b);
        }
        
        
    }
    
}
