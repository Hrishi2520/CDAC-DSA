package searching;

import java.util.Scanner;

public class Searching {
    static void print_array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " , ");
        }
    }

    static int binary_search(int[] a, int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == key)
                return mid;//found else
            {
                if (key < a[mid])
                    return binary_search(a, start, mid - 1, key);//go to left else
                return binary_search(a, mid + 1, end, key);
            }//go to right }
        } else
            return (-1);
    }//not found }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Searching.print_array(a);
        System.out.println("Enter element to search:");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        int response = Searching.binary_search(a, 0, a.length - 1, key);
        if (response == -1)
            System.out.println("\n" + key + " not found in array");
        else
            System.out.println("\n" + key + "found at index " + response + " in array");

    }
}
