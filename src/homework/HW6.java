package homework;

public class HW6 {

    static int tcNumber = 1;

    public static void printTaskNumber() {
        System.out.println("Task " + tcNumber++);
    }

    public static void main(String[] args) {
        printTaskNumber();

        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }

        System.out.println();
        printTaskNumber();

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        printTaskNumber();

        for (int i = 50; i <= 55; i += 2) {
            System.out.println(i);
        }

        System.out.println();
        printTaskNumber();

        for (int i = 327; i >= 300; i -= 7) {
            System.out.println(i);
        }

        //        Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        System.out.println();
        printTaskNumber();

        for (double i = 12; i <= 13; i += 0.1) {
            System.out.println(Math.round(i * 10));

        }

        System.out.println();
        printTaskNumber();

        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        printTaskNumber();
        for (int i = 7; i <= 14; i++) {
            if (i % 2 == 7) {
                System.out.println(i);
            }
        }

//        Распечатать последовательность которая начинается с минимального значения типа данных short и
//        заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
        System.out.println();
        printTaskNumber();
        for (int i = 7; i <= 14; i++) {
            if (i % 2 == 7) {
                System.out.println(i);
            }
        }

    }




}
