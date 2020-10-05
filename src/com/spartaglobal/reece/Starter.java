package com.spartaglobal.reece;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Starter {
    public void start() {
        ArrayGen ag = new ArrayGen();
        int[] randArray = ag.getInts(20);
        float[]randFloats = ag.getFloats(10);
        Printer p = new Printer();
        BubbleSort bubble = new BubbleSort();
        int[] array = {5,7,5,2,1,4,6,7,12,2};
        p.printArray(array);
        int[] array2 = bubble.bubbleSort(array);
        p.printArray(array2);

        p.printArray(randArray);
        int[] randArraySorted = bubble.bubbleSort(randArray);
        p.printArray(randArraySorted);

        p.printArray(randFloats);
        float[] randFloatsSorted = bubble.bubbleSort(randFloats);
        p.printArray(randFloatsSorted);
        Arrays.sort(randFloats);
        p.printArray(randFloats);

        ArrayList list = ag.getIntList(10);
        System.out.println(list);
        ArrayList sorted = bubble.bubbleSort(list);
        System.out.println(sorted);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Dave");
        stringList.add("Anne");
        stringList.add("Mark");
        stringList.add("Reuben");
        stringList.add("Ashley");
        stringList.add("Jon");
        stringList.add("Kai");
        stringList.add("Joe");
        stringList.add("Reece");

        System.out.println(stringList);
        ArrayList<String> sortedStrings = bubble.bubbleSort(stringList);
        System.out.println(sortedStrings);
    }
}
