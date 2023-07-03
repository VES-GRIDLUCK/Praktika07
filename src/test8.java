import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int sum = 0;
        int t = 0;
        for (int i = a + 1; i < b; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " Fizz");
                if (i % 5 == 0) {
                }
                System.out.println(i + " Buzz");
            }
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + " Fizz Buzz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
