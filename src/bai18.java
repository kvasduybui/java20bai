import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        String text = input.nextLine();
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                index += 1;
            }
        }
        
        System.out.println("So lan xuat hien cua ky tu a: " + index);

        input.close();
    }
}
