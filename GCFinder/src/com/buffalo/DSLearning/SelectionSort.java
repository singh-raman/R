package com.buffalo.DSLearning;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = new int[]{17,43,1,4,100,0,98,11,12};
        new SelectionSort().Sort(data);
        System.out.println(Arrays.toString(data));
    }

    public void Sort(int[] data){

        int temp=0,minIndex=0;
        for(int i=0;i<data.length-1;i++){
            minIndex = i;
            for (int j=i+1;j<data.length;j++){
                if(data[j]<data[minIndex]) {
                    minIndex = j;
                }
            }
            temp = data[minIndex];
            data[minIndex]=data[i];
            data[i]=temp;
        }

    }
}
