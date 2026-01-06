package PracticePgms;
import java.math.BigInteger;
import java.util.Scanner;

public class NumberRange {

    public void check(String data) {
        try {
            Long bInt = Long.parseLong(data);
            System.out.println(data + " can be fitted in:");
            if (bInt >= Byte.MIN_VALUE && bInt <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (bInt >= Short.MIN_VALUE && bInt <= Short.MAX_VALUE) {
                System.out.println("* short ");
            }
            if (bInt >= Integer.MIN_VALUE && bInt <= Integer.MAX_VALUE) {
                System.out.println("* int ");
            }
            if (bInt >= Long.MIN_VALUE && bInt <= Long.MAX_VALUE) {
                System.out.println("* long ");
            }
        } catch (NumberFormatException e) {
            System.out.println(data + " can't be fitted anywhere beyond long ");
        }
    }

    public static void main(String args[]) {
        NumberRange solution = new NumberRange();
        Scanner sc = new Scanner(System.in);
        int data = Integer.parseInt(sc.nextLine());
        String[] array = new String[data];

        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < data; i++) {
            array[i] = sc1.nextLine();
          
        }

        for (int j = 0; j < array.length; j++) {
            solution.check(array[j]);
        }
    }
}
