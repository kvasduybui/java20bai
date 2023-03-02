import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen n: ");
        int n = input.nextInt();
        while (n > 1000 || n < 0) {
            System.out.print("Nhap sai roi, nhap lai so nguyen n: ");
            n = input.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
