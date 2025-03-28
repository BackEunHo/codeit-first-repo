import java.util.Scanner;

public class Calculator {
    // 덧셈
    public static int add(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();


        System.out.println("덧셈: " + add(a, b));
    }

}