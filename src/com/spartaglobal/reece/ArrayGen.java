package com.spartaglobal.reece;

import java.util.ArrayList;
import java.util.Random;

public class ArrayGen {
    public int[] getInts(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public float[] getFloats(int size) {
        Random random = new Random();
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextFloat();
        }
        return array;
    }

    public ArrayList<Integer> getIntList(int size) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt());
        }
        return array;
    }


}
