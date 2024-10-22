import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] numbers = new int[]{1, 2, 3};
        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        double[] numbers1 = new double[]{1.57, 7.654, 9.986};
        int i1;
        for (i1 = 0; i1 < numbers1.length; i1++) {
            System.out.println(numbers1[i1]);
        }
        int[] numbers2 = new int[]{50, 100, 150};
        for (int i2 = 0; i2 < numbers2.length; i2++) {
            System.out.println(numbers2[i2]);
        }
        System.out.println("Задание 2");
        int[] numbers3 = new int[]{1, 2, 3};
        int i3;
        for (i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + ", ");
        }
        System.out.println();
        double[] numbers4 = new double[]{1.57, 7.654, 9.986};
        int i4;
        for (i4 = 0; i4 < numbers1.length; i4++) {
            System.out.print(numbers1[i4] + ", ");
        }
        System.out.println();
        int[] numbers5 = new int[]{50, 100, 150};
        for (int i5 = 0; i5 < numbers2.length; i5++) {
            System.out.print(numbers2[i5] + ", ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int[] numbers6 = new int[]{1, 2, 3};
        for (int i6 = numbers6.length -1; i6 >= 0; i6--) {
            System.out.print(numbers6[i6]);
            if (i6 > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] numbers7 = new double[]{1.57, 7.654, 9.986};
        for (int i7 = numbers7.length -1; i7 >= 0; i7--) {
            System.out.print(numbers1[i7]);
            if (i7 > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] numbers8 = new int[]{50, 100, 150};
        for (int i8 = numbers8.length -1; i8 >= 0; i8--) {
            System.out.print(numbers2[i8]);
            if (i8 > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        int[] numbers9 = {1, 2, 3};
        for (int e = 0; e < numbers9.length; e++) {
            if (numbers9[e] % 2 != 0) {
                numbers9[e] = numbers9[e] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers9));

        double[] numbers10 = new double[]{1.57, 7.654, 9.986};
        for (int e1 = 0; e1 < numbers10.length; e1++) {
            if (numbers10[e1] % 2 != 0) {
                numbers10[e1] = numbers10[e1] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers10));

        int[] numbers11 = new int[]{50, 100, 150};
        for (int e2 = 0; e2 < numbers11.length; e2++) {
            if (numbers11[e2] % 2 != 0) {
                numbers11[e2] = numbers11[e2] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers11));
    }
}
