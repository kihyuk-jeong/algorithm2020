package 코딩테스트.정렬.기초;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UpToDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());


        System.out.println(Arrays.toString(arr));

    }
}
