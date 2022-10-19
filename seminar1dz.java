

// 3. Реализовать простой калькулятор
// 4.* + Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package dz1sem;

import java.util.Scanner;

public class tasks {
    // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    // public static void main(String[] args) {    
    //     // Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("Введите число: ");
    //     Scanner n = new Scanner(System.in);
    //     n.hasNextInt();
    //     int i = n.nextInt();
    //     System.out.println(Math.abs(i * (i + 1)/2));
        
    //     int result=1;
    //     for (int j = 1; j <= i; j++) {
    //         result*=j;
    //     }
    //     System.out.println(result);
        
		
	// }

    // 2. Вывести все простые числа от 1 до 1000
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.printf("Введите число: ");
    //     int top = scanner.nextInt();
    //     for (int i=2;i<top;i++){
    //         if(checkSimple(i))
    //             System.out.println(i);
    //     }
    // }
    
    // public static boolean checkSimple(int i){
    //     if (i<=1)
    //         return false;
    //     else if (i <=3)
    //         return true;
    //     else if (i%2==0 || i %3 ==0)
    //         return false;
    //     int n = 5;
    //     while (n*n <=i){
    //         if (i % n ==0 || i % (n+2) == 0)
    //             return false;
    //         n=n+6;
    //     }
    //     return true;
    // }


    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
    
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
    
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

}
