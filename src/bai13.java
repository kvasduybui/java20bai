import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();    
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
        }

        System.out.print("\nMang dao nguoc la:");
        for (int i = 0; i < n; i++) {
            System.out.print(" a[" + i + "] = " + arr[i] + " |||");
        }

        input.close();
    }
}