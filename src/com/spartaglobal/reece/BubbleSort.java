package com.spartaglobal.reece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Comparable;


public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        return bubbleSort(array, array.length);
    }

    public int[] bubbleSort(int[] array, int size) {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (i+1 < array.length) {
                    if (array[i] > array[i+1]) {
                        int temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                    }
                }
            }
            return bubbleSort(array, size-1);
        }
        else {
            return array;
        }
    }

    public float[] bubbleSort(float[] array) {
        return bubbleSort(array, array.length);
    }

    public float[] bubbleSort(float[] array, int size) {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (i+1 < array.length) {
                    if (array[i] > array[i+1]) {
                        float temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                    }
                }
            }
            return bubbleSort(array, size-1);
        }
        else {
            return array;
        }
    }

    public double[] bubbleSort(double[] array) {
        return bubbleSort(array, array.length);
    }

    public double[] bubbleSort(double[] array, int size) {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (i+1 < array.length) {
                    if (array[i] > array[i+1]) {
                        double temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                    }
                }
            }
            return bubbleSort(array, size-1);
        }
        else {
            return array;
        }
    }

    public ArrayList bubbleSort(ArrayList list) {
        return bubbleSort(list, list.size());
    }

    public <T extends Comparable<T>> ArrayList<T> bubbleSort(ArrayList<T> list, int size) {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (i+1 < list.size()) {
                    if (list.get(i).compareTo(list.get(i+1)) > 0) {
                        Collections.swap(list, i, i+1);
                    }
                }
            }
            return bubbleSort(list, size-1);
        }
        return list;
    }

    public <T extends Comparable<T>> T[] bubbleSort(T[] array) {
        return bubbleSort(array, array.length);
    }

    public <T extends Comparable<T>> T[] bubbleSort(T[] array, int size) {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (i+1 < array.length) {
                    if (array[i].compareTo(array[i+1]) > 0) {
                        T temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                    }
                }
            }
            return bubbleSort(array, size-1);
        }
        return array;
    }
}
