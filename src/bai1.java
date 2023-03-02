import java.util.Scanner;

public class bai1 {
    //Bai 1
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n = input.nextInt();

        if (n > 0) {
            System.out.println("Day la so nguyen duong");
        }
        else {
            System.out.println("Day la so nguyen am");
        }

        input.close();
    }
}
