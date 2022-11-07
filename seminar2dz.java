// 1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package dz2sem;

import java.util.Formatter;

// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class seminar2dz {
//     public static void saveArray(ArrayList<Integer> arr, String fileName) {
//         try {
//             FileWriter writer = new FileWriter(fileName);
//             for (Integer c : arr) {
//                 writer.write(c + "\t");
//                 // writer.write(System.getProperty("line.separator")); // построчная запись
//             }
//             writer.close();
//         } catch (IOException ex) {
//             ex.printStackTrace();
//         }
//     }
//     public static void main(String[] args) {
//         int[] array = {10, 3, 53, 2, 5, 7, 3, 6, 12, 3, 32, 65}; //исходный массив
//         // Сортировка пузырьком
//         int temp;                                               // переменная для замены
//         for (int i = array.length - 1; i > 0; i--) {            // внешний цикл
//             for (int j = 0; j < i; j++) {                       // внутренний цикл
//                 if (array[j] > array[j + 1]) {                  // сравнение
//                     temp = array[j];                            // если истино, то меняем
//                     array[j] = array[j + 1];                    // местами элементы
//                     array[j + 1] = temp;
//                 }
//                 saveArray(array[j+1], "dz2sem/ts1.txt");
//             }
//         }
//         // конец сортировки
//         System.out.println(Arrays.toString(array));             //выводим результат на консоль
//     }
//     private static void saveArray(int i, String fileName) {
//     }
    
// }
// 2. Дана json строка (сохранить в файл и читать из файла) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!) 
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов",
// "оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] 
// по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.util.Formatter;

public class seminar2dz {
    public static void main(String[] args) {
        print("Иванов", 5, "Математика");
        print("Петрова", 4, "Информатика");
        print("Краснов", 5, "Физика");
        
    }
    private static void print(String fullName, int mark, String subject) {
        Formatter formatter=new Formatter();
        formatter.format("Студент %s получил %s по предмету %s.", fullName, mark, subject);
        System.out.println(formatter);
        
    }
}
// 3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

// public class seminar2dz {

//     public Boolean vozvrat(String A){
    
//         String B="";
//         String C=A.replace(" ","");
//         char[] mass =C.toCharArray();
//         char[] mass2=new char[mass.length];
//         for ( int i =mass.length-1; i>= 0;){
//             for(int j=0;j<mass2.length; j++){
    
//             mass2[j]=mass[i]; i--;
    
//     B+=mass2[j];
    
//             }
    
//         }
//         System.out.println(B);
//         System.out.println(C);
//         return B.equalsIgnoreCase(C);
    
//     }
    
//     public static void main(String args[]){
//         seminar2dz C=new seminar2dz();
//         System.out.println(C.vozvrat("Гриб не гриб"));
//     }
    
//     }
// 4*. К калькулятору из предыдущего дз добавить логирование.