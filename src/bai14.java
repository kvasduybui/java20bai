import java.util.Scanner;

public class N19DCVT005_OOP_TH2_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] mssv = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ma so sinh vien thu " + i + ": ");
            mssv[i] = input.nextLine();
        }

        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            if (mssv[i].matches("^B170[1-9]{4}$")) {
                System.out.println("Ma so sinh vien thu " + i + " hop le");
            } else {
                System.out.println("Ma so sinh vien thu " + i + " khong hop le");
            }
        }

        input.close();
    }
}
