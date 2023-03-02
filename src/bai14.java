import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mang5So = new int[5];

        System.out.println("Nhap 5 so: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("mang5So[" + i + "] = ");
            mang5So[i] = input.nextInt();
        }
        
        String ma4SoCuoi = "";
        for (int i = 1; i < 5; i++) {
            ma4SoCuoi += mang5So[i];
        }
        String mssv = "00" + mang5So[0] + "L" + ma4SoCuoi;
        
        if (mssv.matches("^00[2-5]{1}L[1-9]{4}$")) {
            System.out.println("Ma so sinh vien hop le");
        } else {
            System.out.println("Ma so sinh vien khong hop le");
        }

        input.close();
    }
}


