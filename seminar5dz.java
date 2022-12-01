package dz5sem;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// public class seminar5dz {

//     private static HashMap<String, String> pb = new HashMap<String, String>();

//         //addPB - добавляет запись по заданным номеру телефона и фамилии
//         private static void addPB(String phone, String name) {
//             pb.put(phone, name);
//         }

//         //delPB - удаляет запись по номеру телефона
//         private static void delPB(String phone) {
//             pb.remove(phone);
//         }

//         //savePB - сохраняет БД в текстовом файле phone.txt
//         private static void savePB() throws IOException {
//             BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
//             for(Map.Entry<String,String> k: pb.entrySet()){
//                 writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
//             }
//             writer.close();
//         }

//         //loadPB - загружает БД из текстового файла phone.txt
//         //производит проверку на наличие файла
//         public static void loadPB() throws IOException {
//             File file = new File("phone.txt");
//             if (file.exists()){
//                 BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
//                 String act;
//                 while ((act=reader.readLine())!=null) {
//                     String[] dat = act.split(" ");
//                     pb.put(dat[0], dat[1]);
//                 }
//                 reader.close();
//             }
//         }

//         //PrintPhonebook - выводит на екран все записи БД
//         public static void PrintPhonebook(){
//             System.out.println("Телефонный справочник: ");
//             for(Map.Entry<String,String> k: pb.entrySet()){
//                 System.out.println(k.getValue()+": "+ k.getKey());
//             }
//         }

//         //FindSurname - производит поиск фамилии по номеру телефона заданому в качестве аргумента
//         //возвращает строку
//         public static String FindSurname(String number){
//             String result = pb.get(number);
//             if (result == null) return "абонент с таким номером не найдей";
//             return result;
//         }

//         //FindNumberPhone - производит поиск списка номеров по фамилии заданой в качестве аргумента
//         //возвращает массив строк
//         public static String[] FindNumberPhone(String surname){
//             List <String> result = new ArrayList<String>();
//             for (Map.Entry entry : pb.entrySet()) {
//                 if (surname.equalsIgnoreCase((String)entry.getValue())){
//                     result.add((String)entry.getKey());
//                 }
//             }
//             if (result.size() == 0) result.add("абонент с такой фамилией не найден");
//             return result.toArray(new String[0]);
//         }

//     public static void main(String[] args) throws IOException {
//         //переменная описывает вызываемое действие
//         String act;

//         //загрузка БД
//         loadPB();
//         //вывод записей на екран
//         PrintPhonebook();

//         //вывод на екран описания возможных действий с указанием команд
//         System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти номера по фамилии, (sur)найти фамилию, " +
//                             "(save)сохранить, (exit)выход");

//         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//         act = bf.readLine();
//         while(!act.equals("exit")){
//             //добавление записи
//             if(act.equals("add")){
//                 System.out.println("Введите фамилию:");
//                 String name = bf.readLine();
//                 System.out.println("Введите телефон:");
//                 String phone = bf.readLine();
//                 addPB(phone, name);
//             }else{
//                 //удаление записи
//                 if(act.equals("del")){
//                     System.out.println("Введите телефон:");
//                     String phone = bf.readLine();
//                     delPB(phone);
//                 }else{
//                     //поиск номеров по фамилии
//                     if (act.equals("num")){
//                         System.out.println("Введите фамилию:");
//                         String surname = bf.readLine();
//                         String[] numbers = FindNumberPhone(surname);
//                         for (String number : numbers) {
//                             System.out.println(number);
//                         }
//                     } else {
//                         //поиск фамилии по номеру
//                         if (act.equals("sur")) {
//                             System.out.println("Введите номер:");
//                             String number = bf.readLine();
//                             System.out.println(FindSurname(number));
//                         } else {
//                             //сохранение БД в файл
//                             if(act.equals("save")){
//                                 savePB();
//                             }
//                         }
//                     }
//                 }
//             }
//             //запрос на следующее действие
//             System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти номера по фамилии, (sur)найти фамилию, (save)сохранить, (exit)выход");
//             act=bf.readLine();
//         }
//     }
// }

//2. Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени.



// import java.util.*;
// import java.util.List;
// import java.io.*;


// public class seminar5dz {
    
//     public static List<String> fillTheArray(List<String> array) {
//         array.add("Иван Иванов");
//         array.add("Светлана Петрова");
//         array.add("Кристина Белова");
//         array.add("Анна Мусина");
//         array.add("Анна Крутова");
//         array.add("Иван Юрин");
//         array.add("Петр Лыков");
//         array.add("Павел Чернов");
//         array.add("Мария Федорова");
//         array.add("Мария Савина");
//         array.add("Мария Рыкова");
//         array.add("Марина Лугова");
//         array.add("Анна Владимирова");
//         array.add("Иван Мечников");
//         array.add("Петр Петин");
//         array.add("Иван Ежов");
//         return array;
//     }
//     public static List<String> fillTheArrayFromFile(List<String> array, String fileName) throws IOException {
//         StringBuffer buffer = new StringBuffer();
//         try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//             while (reader.ready()) {
//                 buffer.append(reader.readLine() + "\n");
//             }
//         }
//         if(buffer.length() > 0) {
//             String[] tempArr = buffer.toString().split(" ");
//             for (String temp : tempArr) {
//                 array.add(temp);
//             }
//         }
//         return array;
//     }

//     public static void printUniqueWords(List<String> array) {
//         Set<String> tempArray = new LinkedHashSet<>();
//         for (String arr : array) {
//             String a = arr.toLowerCase();
//             tempArray.add(a);
//         }
//         for (String tempArr : tempArray) {
//             int count = 0;
//             for (String arr : array) {
//                 String a = arr.toLowerCase();
//                 if(tempArr.equals(a)) count++;
//             }
//             System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);
//         }
//         System.out.println();
//     }
    

// }
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

public class seminar5dz {

    public static void printMatrix(char[][] board) {
      // 8x8 board
      int n = board.length;
      System.out.println("------------------------------");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(board[i][j] + "|");
        }
        System.out.println();
      }
      System.out.println("------------------------------");
  
    }
  
    public static void updateBoard(int row, int col, boolean[][] logicalBoard) {
      // Turn all the cases corresponding to the row, column and diagonals of the element added to
      // false
      // 8x8 board
      int n = logicalBoard.length;
  
      // update the row
      for (int j = 0; j < n; j++) {
        logicalBoard[row][j] = false;
      }
  
      // update the column
      for (int j = 0; j < n; j++) {
        logicalBoard[j][col] = false;
      }
  
      // update the diagonals
      int r = row;
      int c = col;
      while (r >= 0 && c >= 0) {
        logicalBoard[r][c] = false;
        r--;
        c--;
      }
  
      r = row;
      c = col;
      while (r < 8 && c < 8) {
        logicalBoard[r][c] = false;
        r++;
        c++;
      }
  
      r = row;
      c = col;
      while (r < 8 && c >= 0) {
        logicalBoard[r][c] = false;
        r++;
        c--;
      }
  
      r = row;
      c = col;
      while (r >= 0 && c < 8) {
        logicalBoard[r][c] = false;
        r--;
        c++;
      }
    }
  
    public static char[][] copyArray(char[][] original) {
      char[][] copy = new char[original.length][];
      for (int i = 0; i < original.length; i++) {
        copy[i] = original[i].clone();
      }
      return copy;
    }
  
    public static boolean[][] copyArray(boolean[][] original) {
      boolean[][] copy = new boolean[original.length][];
      for (int i = 0; i < original.length; i++) {
        copy[i] = original[i].clone();
      }
      return copy;
    }
  
    public static void arrangeQueens(char[][] board, boolean[][] logicalBoard, int rowNumber) {
      if (rowNumber == 8) {
        printMatrix(board);
        return;
      }
  
      int n = board.length;
      for (int column = 0; column < n; column++) {
        if (logicalBoard[rowNumber][column]) {
          char[][] newBoard = copyArray(board);
          boolean[][] newLogicalBoard = copyArray(logicalBoard);
          newBoard[rowNumber][column] = 'Q';
          newLogicalBoard[rowNumber][column] = false;
          updateBoard(rowNumber, column, newLogicalBoard);
          arrangeQueens(newBoard, newLogicalBoard, rowNumber + 1);
        }
      }
    }
  
    public static void arrangeQueens() {
      int N = 8;
      char[][] board = new char[8][8];
      boolean[][] logicalBoard = new boolean[8][8];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          board[i][j] = ' ';
          logicalBoard[i][j] = true;
        }
      }
      arrangeQueens(board, logicalBoard, 0);
    }
  
    public static void main(String[] args){
      arrangeQueens();
    }
  
  }
  