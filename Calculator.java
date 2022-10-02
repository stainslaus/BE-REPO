/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author LAB1
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char operator ;
        Double number1, number2, result;
        
        //creating scanner object class
        Scanner input;
        input = new Scanner (System.in);
        
        //enter operators
        System.out.println("choose an operator: +, -, *, /");
        operator = input.next().charAt(0);
        
        //ask users to enter numbers
        System.out.println("enter the first number");
        number1 = input.nextDouble();
        
        System.out.println("enter the second number");
        number2 = input.nextDouble();
        
        switch (operator) {
            //perform addtion between two numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
                
                //perfom subtraction between two numbers
                  case '-':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
                // perform multiplication between two numbers
                  case '*':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
                //perform division between two numbers
                  case '/':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
                
                  default:
                      System.out.println("invalid operator!");
                      break;
                
        }
        
        
        input.close();
        
    }
    
}
