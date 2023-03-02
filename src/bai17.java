import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        String text = input.nextLine();

        int flag = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
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
