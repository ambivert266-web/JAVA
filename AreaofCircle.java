import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value of redious");
        int redious = Sc.nextInt();
        int pi = 3;
        int AreaofCircle = pi * redious * redious;
        System.out.println("Area of circle" + AreaofCircle);

    }

}
