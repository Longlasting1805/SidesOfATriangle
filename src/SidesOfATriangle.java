import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Non Zero Value: ");
        int a = scanner.nextInt();

        System.out.print("Enter Non Zero Value: ");
        int b = scanner.nextInt();

        System.out.print("Enter Non Zero Value: ");
        int c = scanner.nextInt();

       boolean triangle;

        triangle = a + b > c && b + c > a && c + a > b;
        System.out.print("Value sides of triangle: "+ triangle);

    }
}
