// 1) Реализовать алгоритм сортировки слиянием

package dz3sem;

// class MergeSort {
//     void merge(int arr[], int l, int m, int r)
//     {
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         int L[] = new int[n1];
//         int R[] = new int[n2];

//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1 + j];

//         int i = 0, j = 0;

//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             }
//             else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }

//     void sort(int arr[], int l, int r)
//     {
//         if (l < r) {

//             int m = l + (r - l) / 2;
 
//             sort(arr, l, m);
//             sort(arr, m + 1, r);

//             merge(arr, l, m, r);
//         }
//     }
 
//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         for (int i = 0; i < n; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }

//     public static void main(String args[])
//     {
//         int arr[] = { 12, 11, 13, 5, 6, 7, 1, 0, 99, 23, 57, 9, 2, 1 };
 
//         System.out.println("Массив:");
//         printArray(arr);
 
//         MergeSort ob = new MergeSort();
//         ob.sort(arr, 0, arr.length - 1);
 
//         System.out.println("\nОтсортированный массив");
//         printArray(arr);
//     }
// }





// 2) Пусть дан произвольный список целых чисел, удалить из него четные числа

// import java.util.ArrayList;
// import java.util.Random;

// public class tasks {
//     public static void main(String[] args) {
//         Random rnd = new Random();
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         for (int i = 0; i < 10; i++) {
//             int val = rnd.nextInt(100);
//             list1.add(val);
//         }
//         System.out.printf("Первоначальный список %s\n", list1);
//         int i = 0;
//         while (i < list1.size()) {
//             if (list1.get(i) % 2 == 0) {
//                 list1.remove(i);
//             }
//             else {
//                 i++;
//             }
//         }
//         System.out.printf("Список с удаленными четными числами %s", list1);
//     }
// }

// 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class tasks {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int max = max(list1);
        int min = min(list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list1.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}



