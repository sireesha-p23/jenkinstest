package com.sapient.ui;

import com.sapient.training.service.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator myCalc=new Calculator();
        System.out.println( myCalc.addition(2.0, 4.0) );
        System.out.println( myCalc.subtraction(4,2) );

    }
}
