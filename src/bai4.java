import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap ba so thuc: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Day khong phai ba canh cua hinh tam giac");
        } else {
            if ((a*a + b*b) == c*c || (a*a + c*c) == b*b || (b*b + c*c) == a*a) {
                System.out.println("Day la ba canh cua hinh tam giac vuong");
            } else {
                System.out.println("Day khong phai la ba canh cua hinh tam giac vuong");
            }
        }
        input.close();
        }
        
    }