package com.pb.poliscuk.hw2;
import java.util.Scanner;
import java.lang.String;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;    // переменная хранит тип операции
        char repeat;    // считываем в цикле "Y" or "N"

        // В цикле крутим тело программы пока пользователь не ответит "No"
        do {
            System.out.print("Введите целое число. Operand1 = ");
            operand1 = scan.nextInt();
            System.out.print("Введите целое число. Operand2 = ");
            operand2 = scan.nextInt();
            System.out.print("Введите знак арифметической операции. Sing = ");
            sign = scan.next();
            // определим какой арифметический знак ввел пользователь
            switch (sign) {
                case "+":
                    //result = operand1 + operand2;
                    System.out.println("Полученный результат = " + (operand1 + operand2));
                    break;
                case "-":
                    System.out.println("Полученный результат = " + (operand1 - operand2));
                    break;
                case "*":
                    System.out.println("Полученный результат = " + (operand1 * operand2));
                    break;
                case "/": {
                    if (operand2 == 0) System.out.println("Извините, но на НОЛЬ делить нельзя");
                    else  System.out.println("Полученный результат = " + ((double) operand1)/operand2);
                    break;
                }
            }
            System.out.print("Продолжим?  Y/N ");
            repeat=scan.next().charAt(0);
            repeat=Character.toUpperCase(repeat);
        }
        while (repeat != 'N' );
    }
}
