import java.util.Scanner;

public class Sorting {
    public static void main(String args[]) {
        int marks[] = { 22, 13, 44, 5, 67, 19 };
        Scanner scan = new Scanner(System.in);
        System.out.println("Select any one sorting algorithm.\n1.BubbleSort\n2.Selection Sort\nEnter your choice now.");
        int selectedSortAlgo = scan.nextInt();
        switch (selectedSortAlgo) {
        case 1:
            bubbleSort(marks);
            break;
        case 2:
            selectionSort(marks);
            break;
        }
        System.out.println("Array after sorting");
        for (int data : marks) {
            System.out.println(data);
        }
    }

    public static void bubbleSort(int arr[]) {
        int pass = 1;
        int n = arr.length;
        do {
            for (int j = 0; j <= n - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            pass++;
        } while (pass <= n - 1);

    }

    public static void selectionSort(int arr[]) {
        int minindex = 0;
        for (int j = 0; j <= arr.length - 2; j++) {
            minindex = j;
            // inner for-loop
            for (int i = j + 1; i <= arr.length - 1; i++) {
                if (arr[i] < arr[minindex]) {
                    minindex = i;
                }

            }
            if (j != minindex) {
                int temp = arr[j];
                arr[j] = arr[minindex];
                arr[minindex] = temp;
            }
        }
    }

}
