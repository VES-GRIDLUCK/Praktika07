import java.util.Scanner;

public class test4 {
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
            t++;
            sum = i +sum;
        }
        float sr = sum / t;
        System.out.println(sum);
        System.out.println(sr);
    }
}
