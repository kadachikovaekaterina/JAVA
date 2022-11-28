// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package dz4sem;
import java.util.*;
// public class seminar4dz {    

//     public static void main(String[] args) {
//         LinkedList<String> linkedli = new LinkedList<String>();
        
//         linkedli.add("Вишня");
//         linkedli.add("Варенники");
//         linkedli.add("Варка");
//         System.out.print("Элементы до сортировки: " + linkedli);
//         linkedli = reverseLinkedList(linkedli);
//         System.out.print("\nЭлементы после сортировки: " + linkedli);
//     }
  
//     public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
//         LinkedList<String> revLinkedList = new LinkedList<String>();
//         for (int i = llist.size() - 1; i >= 0; i--) {
//             revLinkedList.add(llist.get(i));
//         }
//         return revLinkedList;
//     }
// }

// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.ListIterator;

// public class seminar4dz {
    
//     public static void main(String[] args) {
 
//         PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
 
//         myPriorityQueue.add(1);
//         myPriorityQueue.add(2);
//         myPriorityQueue.add(3);
        
//         // for(int i: myPriorityQueue)       // dequeue() - возвращает первый элемент из очереди и удаляет его,
//         //     System.out.println(i);
//         // myPriorityQueue.poll();
//         // System.out.println("After removing:");
//         // for(int i: myPriorityQueue)
//         //     System.out.println(i);
        
//         // myPriorityQueue.offer(22);           // enqueue() - помещает элемент в конец очереди,

//         // for(int i: myPriorityQueue)
//         //     System.out.println(i);

//         System.out.println(myPriorityQueue.peek());  // first() - возвращает первый элемент из очереди, не удаляя.
//     }
// }

// 3. В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1+2
// 3
// +4
// 7
// Отмена
// 3
// *3
// 9
// public class seminar4dz {
//     static Scanner scanner = new Scanner(System.in);
        
//     public static void main(String[] args) {
//         int num1 = getInt();
//         int num2 = getInt();
//         char operation = getOperation();
//         int result = calc(num1,num2,operation);
//         System.out.println("Результат операции: "+result);
//     }

//     public static int getInt(){
//         System.out.println("Введите число:");
//         int num;
//         if(scanner.hasNextInt()){
//             num = scanner.nextInt();
//         } else {
//             System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//             scanner.next();//рекурсия
//             num = getInt();
//         }
//         return num;
//     }

//     public static char getOperation(){
//         System.out.println("Введите операцию:");
//         char operation;
//         if(scanner.hasNext()){
//             operation = scanner.next().charAt(0);
//         } else {
//             System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
//             scanner.next();//рекурсия
//             operation = getOperation();
//         }
//         return operation;
//     }

//     public static int calc(int num1, int num2, char operation){
//         int result;
//         switch (operation){
//             case '+':
//                 result = num1+num2;
//                 break;
//             case '-':
//                 result = num1-num2;
//                 break;
//             case '*':
//                 result = num1*num2;
//                 break;
//             case '/':
//                 result = num1/num2;
//                 break;
//             default:
//                 System.out.println("Операция не распознана. Повторите ввод.");
//                 result = calc(num1, num2, getOperation());//рекурсия
//         }
//         return result;
//     }

// }
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
 
public class seminar4dz 
{
    // Объявляем и инициализируем компоненты окна
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);
    // Конструктор
     seminar4dz()
     {
         // Установить менеджер расположения для панели
         BorderLayout bl = new BorderLayout();
         windowContent.setLayout(bl);
         
         // Добавляем дисплей в верхней части окна
         windowContent. add("North", displayField);
         
         // Создаем панель с менеджером расположения GridLayout
         // в которой будет 12 кнопок - 10 цифр, и
         // кнопки “точка” и “равно”
         JPanel p1 = new JPanel();
         GridLayout gl = new GridLayout(4,3);
         p1.setLayout(gl) ;
         p1.add(button1);
         p1.add(button2);
         p1.add(button3);
         p1.add(button4);
         p1.add(button5);
         p1.add(button6);
         p1.add(button7);
         p1.add(button8);
         p1.add(button9);
         p1.add(button0);
         p1.add(buttonPoint);
         p1.add(buttonEqual);
         
         // Добавляем панель p1 в центр окна
         windowContent. add("Center", p1);
         
         // Создаем панель с менеджером расположения GridLayout
         // на которой будет 4 кнопки -
         // Плюс, Минус, Разделить и Умножить
         JPanel p2 = new JPanel();
         GridLayout gl2 =new GridLayout(4,1);
         p2.setLayout(gl2);
         p2.add(buttonPlus);
         p2.add(buttonMinus);
         p2.add(buttonMultiply);
         p2.add(buttonDivide);
        
         // Добавляем панель p2 в правую часть окна
         windowContent.add("East", p2);
         
         // Создаем frame и добавляем в него содержимое JFrame
         JFrame frame = new JFrame("Calculator");
         frame.setContentPane(windowContent);
         
         // Устанавливаем размер окна, так чтобы уместились
         // все компоненты
         frame.pack(); 
         
         // Показываем окно
         frame.setVisible(true);
         
         // Создаем экземпляр слушателя событий и
         // регистрируем его в каждой кнопке
         CalculatorEngine calcEngine = new CalculatorEngine(this);
         button0.addActionListener(calcEngine);
         button1.addActionListener(calcEngine);
         button2.addActionListener(calcEngine);
         button3.addActionListener(calcEngine);
         button4.addActionListener(calcEngine);
         button5.addActionListener(calcEngine);
         button6.addActionListener(calcEngine);
         button7.addActionListener(calcEngine);
         button8.addActionListener(calcEngine);
         button9.addActionListener(calcEngine);
         buttonPoint.addActionListener(calcEngine);
         buttonPlus.addActionListener(calcEngine);
         buttonMinus.addActionListener(calcEngine);
         buttonDivide.addActionListener(calcEngine);
         buttonMultiply.addActionListener(calcEngine);
         buttonEqual.addActionListener(calcEngine);
    }
     
    public static void main(String[] args) 
    {
        // Создаем экземпляр класса “Калькулятор”
        seminar4dz calc = new seminar4dz();
    }
}