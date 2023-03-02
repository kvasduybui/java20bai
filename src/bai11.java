import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();    
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
            while (arr[i] < 0) {
                System.out.println("Nhap sai roi nhap lai nha");
                System.out.printf("arr[%d] = ", i);
                arr[i] = input.nextInt();
            }
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);

        input.close();
    }
}