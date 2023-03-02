import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();    
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat cua mang la: " + min);

        input.close();
    }
}