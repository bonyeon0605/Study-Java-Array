package ch05;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length-1; i++) {
            boolean changed = false; //자리바꿈 발생 체크

            for (int j = 0; j < numArr.length-1-i; j++)  {
                if(numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }

            if(!changed) break;

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
