package homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(positivOrNegativ(0));
        System.out.println(posOrNeg(-6));
        System.out.println(stringXTimes(5, "one"));
    }

    public static boolean sum(int a, int b) {
        int sum = a + b;
        if (sum >= 0 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String posOrNeg(int number) {
        if (number > 0 || number == 0) {
            return "Число положительное";
        } else {
            return "Число отрицательно";
        }
    }

    public static boolean positivOrNegativ(int num) {
        return (num > 0 || num == 0);
    }

    public static String stringXTimes(int x, String string) {
        int count = 1;
        while (count < x) {
            System.out.println(string);
            count++;
        }
        return string;
    }
}




