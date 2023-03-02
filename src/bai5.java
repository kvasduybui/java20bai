import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ma so sinh vien: ");
        String mssv = input.nextLine();

        if (mssv.matches("^B[1-9]{7}$")) {
            System.out.println("Ma so sinh vien hop le");
        } else {
            System.out.println("Ma so sinh vien khong hop le");
        }

        input.close();
    }
}
