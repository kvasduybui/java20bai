import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap 4 so cuoi cua ma so sinh vien: ");
        String mssv5SoCuoi = input.nextLine();
        String mssv = "B170" + mssv5SoCuoi;
        
        if (mssv.matches("^B170[1-9]{4}$")) {
            System.out.println("Ma so sinh vien hop le");
        } else {
            System.out.println("Ma so sinh vien khong hop le");
        }

        input.close();
    }
}
