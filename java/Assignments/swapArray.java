import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println(" enter n : ");
        int n = scn.nextInt();
        System.out.println("enter array elements :");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("enter idx 1 : " );
        int idx1 = scn.nextInt();
        System.out.println("enter idx 2 : " );
        int idx2 = scn.nextInt();
        swap(arr, idx1, idx2);
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void swap(int [] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }
}
