import java.util.Scanner;

public class CalcOne {
    public static void main(String[] args)
            throws java.io.IOException {

        //double x,z;
        double w1, w2, w3, w4;
        char ch;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        double x = in.nextDouble();



        do {

            System.out.println("введите операзию ( / * - + ), и нажмите enter");
            ch = (char) System.in.read();

            System.out.println("вы выбрали " + ch);
            switch (ch) {
                case '/':
                    w1 = x / z;
                    System.out.println("получилось: " + w1);
                    return;
                case '*':
                    w2 = z * x;
                    System.out.println("получилось: " + w2);
                    return;
                case '-':
                    w3 = x - z;
                    System.out.println("получилось: " + w3);
                    return;
                case '+':
                    w4 = x + z;
                    System.out.println("получилось: " + w4);
                    return;
            }
            }while (ch == '/' || ch == '*' || ch == '-' || ch == '+');

        System.out.println("Введите число:");
        double z = in.nextDouble();

            //double w = z * x;
            //System.out.println(w);

        }
        //while (x < 0) ;
    }

