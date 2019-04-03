package com.buffalo.learning;

public class Main {

    public static void main(String[] args) {
        int [] index = new int[1];
        int[] number = new int[]{2, 7, 11, 17};
        int target = 9;
        Solution sol = new Solution();
        index= sol.twoSumBruteForce(number,target);
        System.out.println(index[0] + ","+ index[1]);
        index = sol.twoSumBruteForce(number,target);
        System.out.println(index[0] + ","+ index[1]);
    }

}
