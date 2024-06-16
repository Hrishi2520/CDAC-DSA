package sorting;

public class Sorting {
    static void bubble_sort(int[] a) {
        int i, j, temp;//i:passes | j:sort | temp:swap for(i=0;i<a.length-1;i++)//n-1 passes {
        for (j = 0; j < a.length - 1; j++) {//j should stop at second last {
            if (a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }

    static void print_array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " , ");
        }
    }

    static void merger(int[] a, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int[] temp = new int[a.length];
        int ti = start;
        while (i <= mid && j <= end) {
            if (a[i] < a[j])
                temp[ti++] = a[i++];
            else
                temp[ti++] = a[j++];
        }
        while (i <= mid)
            temp[ti++] = a[i++];
        while (j <= end)
            temp[ti++] = a[j++];
        for (i = start; i <= end; i++)
            a[i] = temp[i];
    }


    static void mergesort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(a, start, mid);
            mergesort(a, mid + 1, end);
            merger(a, start, mid, end);
        }
    }

    static void quick_sort(int[] a, int start, int end) {
        int i = start;
        int j = end;
        int pivot = start;
        while (i < j) {//stop on merge {
            while (a[i] < a[pivot])
                i++;
            while (a[j] > a[pivot])
                j--;
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        if (i < end)//i->>>>>>end
            quick_sort(a, i + 1, end);
        if (j > start)//start<<<<<<<j
            quick_sort(a, start, j - 1);

    }

    static void insertion_sort(int[] a) {
        int i, j, new_element = 0;
        for (i = 0; i < a.length - 1; i++) {
            j = i + 1;//new_element new_element=a[ j ]
            while (j > 0 && a[j - 1] > new_element) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = new_element;
        }
    }

    static void selection_sort(int[] a) {
        int i, j, min, pos;
        for (i = 0; i < a.length - 1; i++) {
            min = a[i];
            pos = i;
            for (j = i + 1; i < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] a = {55, 11, 88, 22, 44, 77, 33, 99, 66};
        System.out.println("Start:");
        Sorting.print_array(a);
        //Sorting.bubble_sort(a);
        // Sorting.mergesort(a,0,a.length-1);
        // Sorting.quick_sort(a,0,a.length-1);
        System.out.println("\nSorted:");
        Sorting.print_array(a);
    }
}
