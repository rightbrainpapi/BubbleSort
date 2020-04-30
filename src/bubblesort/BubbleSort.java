/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author d.ahuemaen
 */
import java.io.File;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) throws Exception {
        final int MAXNUMBER = 1000;
        Scanner sc = new Scanner(new File("NumbersData.txt"));

        int count;
        int[] number = new int[MAXNUMBER];

        count = populateArray(number);

        bubbleSort(number, count);

        System.out.println("The sorted array is:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d\n", number[i]);
        }
    } // end main

    public static int populateArray(int[] x) throws Exception {
        Scanner sc = new Scanner(new File("NumbersData.txt"));

        int count = 0;
        while (sc.hasNext()) {

            x[count] = sc.nextInt();
            count++;
        }
        return count;
    } // end populateArray

// 
//
    public static void bubbleSort(int[] x, int n) {
        int hold, j, pass;
        boolean switched = true;
        for (pass = 0; pass < n - 1 && switched; pass++) {
// outer loop controles the number of passes
            switched = false; // initially no interchanges have been // made one this pass
            for (j = 0; j < n - pass - 1; j++) {
// inner loop governs each individual pass
                if (x[j] > x[j + 1]) {
// elements are out of order an interhcange is necessary switched = true;
                    hold = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = hold;
                } // end if }//endfor(j=0...
            } // end for (pass = 0 ... } // end bubbleSort method
        } // end BubbleSort class

    }
}
