import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] soChuyenChu = {"khong","mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi"};
        System.out.print("Nhap so nguyen n: ");
        int n = input.nextInt();
        if (n > 0 && n <= 10) {
            System.out.println(soChuyenChu[n]);
        }

        input.close();
    }
}