import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println(" enter n : ");
        int n = scn.nextInt();
        System.out.println("enter array elements :");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int [] arr) {
        int sp = 0; 
        int ep = arr.length-1;
        while (sp<ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++; ep--;
        }
    }
}
