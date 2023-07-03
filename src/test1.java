import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = a+1; i<b; i++){
            System.out.print(i + " ");
        }
    }
}
