package ru.kate.home.lessons.homework;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] baseArray = new int[100];

        for (int i=0; i< baseArray.length; i++) {
            baseArray[i] = (int) (Math.random() * baseArray.length);
        }

        System.out.println("Исходный массив: " + Arrays.toString(baseArray));

        quickSort(baseArray, 0, baseArray.length - 1);

        System.out.println("Отсортированный массив: " + Arrays.toString(baseArray));


    }

    private static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {

            while (source[leftMarker] < pivot) {
                leftMarker++;
            }

            while (source[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }

        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}

