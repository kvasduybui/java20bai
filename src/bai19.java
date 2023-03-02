import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = input.nextLine();

        if (chuoi.length() > 20) {
            System.out.println("Khong duyet");
        } else {
            if (chuoi.matches("^[A-Z][a-zA-Z0-9]*[0-9]$") && !chuoi.contains(" ")) {
                System.out.println("Duyet");
            } else {
                System.out.println("Khong duyet");
            }
        }

        input.close();
    }
}
