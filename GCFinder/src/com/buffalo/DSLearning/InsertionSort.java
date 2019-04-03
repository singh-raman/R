package com.buffalo.DSLearning;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int data[] = new int[] {17,43,1,4,100,0,98,11,12};
        new InsertionSort().Sort(data);
        System.out.println(Arrays.toString(data));
    }

    public void Sort(int[] data){
        int temp=0,current=0;
        for (int i=0;i<data.length;i++){
            current = data[i];
            int j=i-1;
            System.out.println("outer:"+j);
            while (j>=0 && data[j]>=current)
            {
                System.out.println("inner:"+j);
                data[j+1] = data[j];
                j--;
            }
            data[j+1]=current;
        }
    }
}
