import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong n: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.print("Nhap lai so nguyen n: ");
            n = input.nextInt();
        }
        int tongN = 0;
        for(int i = 0; i < n; i++) {
            tongN += i;
        }
        System.out.println("Ket qua: " + tongN);

        input.close();
    }
}
