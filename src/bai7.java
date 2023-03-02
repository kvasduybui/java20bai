import  java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = input.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }

        input.close();
    }
}
