import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println(" enter n : ");
        int n = scn.nextInt();
        System.out.println("enter array elements :");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
}
}