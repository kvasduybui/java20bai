import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();    
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }
        int average = 0;
        for (int i = 0; i < n; i++) {
            average += arr[i];
        }
        average /= n;
        System.out.println("Trung binh cua mang la: " + average);

        input.close();
    }
}
