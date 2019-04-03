package com.buffalo.DSLearning;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = new int[]{8,3,1,9,33,100,0,2,456};
        System.out.println(data.length);
        new BubbleSort().Sort(data);
        System.out.println(Arrays.toString(data));
    }

    public void Sort(int data[]){
        int temp =0;
        for(int i=0;i<data.length-1;i++){
            for (int j=0;j<data.length-1-i;j++){
                if (data[j]>data[j+1]) {
                    temp = data[j + 1];
                    data[j+1]=data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
