/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    //class variables
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //instance variables
        App myApp = new App();
        TaxCalculator calc = new TaxCalculator();

        //input
        myApp.input(calc);

        //calculate and output
        calc.Calculate(calc.getOrderPrice(), calc.getState());
    }

    public void input(TaxCalculator calculator) {
        //quantity
        System.out.print("What is the order amount? ");
        calculator.setOrderPrice(in.nextFloat());
        calculator.setTotal(BigDecimal.valueOf(calculator.getOrderPrice()));

        //state
        System.out.print("What is the state? ");
        calculator.setState(in.next());
    }
}



