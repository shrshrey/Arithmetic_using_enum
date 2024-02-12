/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author shreya shreya (991713126)
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE):");
        Operation operation = Operation.valueOf(in.next().toUpperCase());

        ArithmeticBase r = new ArithmeticBase();
        double result = r.calculate(m, n, operation);

        System.out.println("Result: " + result);
    }
}
