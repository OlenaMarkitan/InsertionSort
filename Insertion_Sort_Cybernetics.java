package com.marlen.java.lesson_1.Lesson7_1.Home7.Sorting.Insertion_Sort;

// Кружок факультета Кибернетики

public class Insertion_Sort_Cybernetics {
    public static void main(String a[]){
        int[] arr1 = {544,10,34,2,56,0,7,67,88,5,42};
       insertionSort(arr1);
        for(int i:arr1){
            System.out.print(i+", ");
        }
    }
    public static void insertionSort(int a[]){
        int n=a.length;
        for (int i = 0; i < n; i++) {
            // вытягиваем элемент из массива и запоминаем значение в х
            int j=i-1;
            int x=a[i];

            // пока не закончились позиции и этот элемент больше того, который вставляем
            while(j>=0 && a[j]>x ){
                // смещаем этот елемент на одну позицию
                a[j+1]=a[j];
                j--;
            }
            // ставим элемент после первого элемента, не большего чем наш
            a[j+1]=x;
        }
    }
}
