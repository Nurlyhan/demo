// Тестовое задание калькулятор Java
package Nurlyhan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculator {

    public static void main(String[] args) {
        try{
            System.out.println("Калькулятор для выражений вида: \"Число1 Операция Число2\", через пробел. Допускаются числа от 1 до 10 или от I до X включительно. Операции: + - * /");
            System.out.print("Input: ");
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            String calcString = bReader.readLine();

            Calc calc = new Calc();
            String result = calc.result(calcString);
            System.out.println("Output: " + result);
        }
        catch(CalcException | IOException e){

        }

    }

}