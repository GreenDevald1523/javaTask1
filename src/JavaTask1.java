import java.lang.reflect.Array;

public class JavaTask1 {
    public static void main(String[] args) {
        System.out.println("1 задача");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));

        System.out.println('\n');

        System.out.println("2 задача");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));

        System.out.println('\n');

        System.out.println("3 задача");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));

        System.out.println('\n');

        System.out.println("4 задача");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));

        System.out.println('\n');

        System.out.println("5 задача");
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));

        System.out.println('\n');

        System.out.println("6 задача");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));

        System.out.println('\n');

        System.out.println("7 задача");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));

        System.out.println('\n');

        System.out.println("8 задача");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));

        System.out.println('\n');

        System.out.println("9 задача");
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[]{}));

        System.out.println('\n');

        System.out.println("10 задача");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    public static int remainder(int a, int b) {
        return (a % b);
    }

    public static int triArea(int a, int b) {
        return (a * b) / 2;
    }

    public static int animals(int chickens, int cows, int pigs) {
        return (chickens * 2) + (cows * 4) + (pigs * 4);
    }

    public static boolean profitableGamble(double a, int b, int c) {
        if (a * b > c) {
            return true;
        }
        return false;
    }

    public static String operation(int N, int a, int b) {
        if (a + b == N) {
            return "added";
        }
        else if (a - b == N) {
            return "subtracted";
        }
        else if (a * b == N) {
            return "multiplyed";
        }
        else if (a / b == N) {
            return "divided";
        }
        else {
            return "none";
        }
    }

    public static int ctoa(char sym) {
        int asciiSym = sym;
        return asciiSym;
    }

    public static int addUpTo(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            counter+=i;
        }
        return counter;
    }

    public static int nextEdge(int first, int second) {
        return (first + second) - 1;
    }

    public static int sumOfCubes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 3);
        }
        return sum;
    }

    public static boolean abcmath(int a, int b, int c) {
        int counter = a;
        for (int i = 0; i < b; i++) {
            counter*=2;
        }
        if (counter % c == 0) {
            return true;
        }
        return false;
    }
}