import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap ba so thuc: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Day khong phai ba canh cua hinh tam giac");
        } else { 
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("Day la ba canh cua hinh tam giac");
            } else {
                System.out.println("Day khong phai ba canh cua hinh tam giac");
            }
        }
        
        input.close();
        }
        
    }