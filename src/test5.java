import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp=1;
        for (int i = 1; i <= n; i++) {
            tmp =i * tmp;
        }
        System.out.println(tmp);
    }
}
