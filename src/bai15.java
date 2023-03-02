import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        String text = input.nextLine();
        System.out.print("Nhap 1 ky tu: ");
        char kyTu = input.next().charAt(0);
        int flag = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == kyTu) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Co");
        } else {
            System.out.println("Khong");
        }


        input.close();
    }
}
