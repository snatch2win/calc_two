import java.util.Scanner;

public class CalcOne {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Это калькулятор");
        double w;
        char ch;

        do {
            System.out.println("Введите число:");
            double x = scanner.nextDouble();

            System.out.println("введите операзию ( / * - + ), и нажмите enter");
            ch = (char) System.in.read();

            System.out.println("вы выбрали " + ch);

            System.out.println("Введите число:");
            double z = scanner.nextDouble();

            switch (ch) {
                case '/':
                    w = x / z;
                    System.out.println("получилось: " + w);
                    break;
                case '*':
                    w = z * x;
                    System.out.println("получилось: " + w);
                    break;
                case '-':
                    w = x - z;
                    System.out.println("получилось: " + w);
                    break;
                case '+':
                    w = x + z;
                    System.out.println("получилось: " + w);
                    break;
                default:
                    System.out.println("Введите операцию вычесления ( /, *, -, + )");
                    int pi = scanner.nextInt();
            }
            System.out.println("Продолжить? Yes = 1, No = 0");
        } while (scanner.nextInt() == 1);

    }
}

