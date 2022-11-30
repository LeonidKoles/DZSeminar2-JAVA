// 4*. К калькулятору из предыдущего дз добавить логирование.

package Seminar2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zadacha4 {
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = num.nextDouble();
        System.out.println("Введите второе число: ");
        Double num2 = num.nextDouble();
        System.out.println("Введите знак операции: ");
        char ch = num.next().charAt(0);
        double res = 0;
        num.close();
        Logger log = Logger.getLogger(zadacha4.class.getName());
  
        switch(ch){
            case '+': res = num1 + num2;
                break;
            case '-': res = num1 - num2;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num1 / num2;
                break;
            default: System.out.println("Введен некоректный знак!!!");
            
        }
        String strmsgf = "operation complite result is " + res;
        System.out.println("Результата будет следующим: ");
        System.out.printf(num1 + " " + ch + " " + num2 + " = " + res);
        log.log(Level.INFO, strmsgf);
    }
}
    

