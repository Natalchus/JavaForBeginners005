package homework;

import javax.sound.midi.Soundbank;

public class HW5 {

    String rub = "руб.";
    String cop = "коп.";
    static int tcNumber = 2;

    //    static double tcNumberDot = .1;
//    public static void printTCNumberDot(){
//        System.out.print("TC_" + tcNumber++ + tcNumberDot + "\t -- \t");
//    }
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.println(value);
        System.out.println();

    }

    //   Task 1
    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        }

            return "Fail";
        }


    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    //    Task 2
    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String returnDay(int day) {
        if (day > 0 && day < 8) {
            if (day == 1) {

                return "Monday";
            }
            if (day == 2) {

                return "Tuesday";
            }
            if (day == 3) {

                return "Wednesday";
            }
            if (day == 4) {

                return "Thursday";
            }
            if (day == 5) {

                return "Friday";
            }
            if (day == 6) {

                return "Saturday";
            }
            if (day == 7) {

                return "Sunday";
            }
        }

        return "Error";
    }

    //   Task 3
    public static int findAverage(int age1, int age2, int age3) {
        if (age1 >= 0 && age2 >= 0 && age3 >= 0 && age1 < 150 && age2 < 150 && age3 < 150) {

            return ((age1 + age2 + age3) / 3);
        } else {

            return Integer.MIN_VALUE;
        }
    }

    //    Task 4
    public static int findMaxOf2(int k, int l) {

        return Math.min(k, l);
    }

    public static int findMaxOf3(int k, int l, int m) {

        return Math.min(findMaxOf2(k, l), m);
    }

    public static int findMaxOf4(int k, int l, int m, int n) {

        return Math.min(findMaxOf3(k, l, m), n);
    }

    //    Task 5
    public static double findAverageTemp(double t1, double t2, double t3, double t4, double t5) {
        if (t1 >= 25 && t1 <= 45 && t2 >= 25 && t2 <= 45 && t3 >= 25 && t3 <= 45
                && t4 >= 25 && t4 <= 45 && t5 >= 25 && t5 <= 45) {

            return ((t1 + t2 + t3 + t4 + t5) / 5);
        } else {

            return -1;
        }

    }

    //        Task 6
    public static int findSalary(int hours, double price1hour) {
        int workDays = 22;
        if (hours > 0 && hours < 25 && price1hour >= 12) {

            return (int) price1hour * hours * workDays;
        } else {

            return -1;
        }
    }
//        Task 7
     public static double findCountOfGood(double priceFor1, double amount) {
         if (priceFor1 > 0.0 && amount > 0.0) {

             return priceFor1 * amount;
         } else {

             return -1;
         }
     }
//
//     public static String getSalaryDoc(String name, double salary) {
//
//
//        if (salary >= 0 && ) {
//
//            return "Смирнова Мария Ивановна \t\t" + salary
//        }
//     }
//    Написать метод, который принимает на вход необходимые параметры и возвращает строку
//    ведомости выдачи зарплаты сотрудникам.
//    Например:
//
//            “Смирнова Мария Ивановна 		70000 руб 00 коп”
//
//    если имя сотрудника придет в виде пустой строки или в виде null (String -  это
//    референсный тип данных и может принимать значение null), то в ведомости должна быть
//    распечатана пустая строка "".
//    Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана,
//    как 0, то в ведомости тоже должна быть распечатана пустая строка ""
//
//
//    Протестировать метод.


    public static void main(String[] args) {

//    TC2
        String expectedResult = "Monday";
        String actualResult = returnDay(1);
        verifyEquals("Monday", actualResult);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

//        TC3
        int expectedResult3 = 40;
        int actualResult3 = findAverage(20, 40, 60);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult3, actualResult3));


//        TC3.1
        int expectedResult30 = 40;
        int actualResult30 = findAverage(-5, -30, -3);

        printTestResult(verifyEquals(expectedResult30, actualResult30));
//        findAverage(20, 40, -4);
//        System.out.println(findAverage(20, 40, 60));

//        TC4 k = 3, l = 30, m = 300, n = 3000
        int expectedResult4 = 3;
        int actualResult4 = findMaxOf2(3, 30);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult4, actualResult4));

//        TC4.1
        int expectedResult40 = 3;
        int actualResult40 = findMaxOf3(3, 30, 300);

        printTestResult(verifyEquals(expectedResult40, actualResult40));

//        TC4.2
        int expectedResult400 = 3;
        int actualResult400 = findMaxOf4(3, 30, 300, 3000);

        printTestResult(verifyEquals(expectedResult400, actualResult400));

//        TC5
        double expectedResult5 = 39;
        double actualResult5 = findAverageTemp(39, 39, 39, 39, 39);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult5, actualResult5));

//        TC5.1
        double expectedResult50 = 39;
        double actualResult50 = findAverageTemp(39, 39, 39, 39, 46);

        printTestResult(verifyEquals(expectedResult50, actualResult50));

//        TC6
        int expectedResult6 = 4400;
        int actualResult6 = findSalary(10, 20);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult6, actualResult6));

//        TC6.1
        int expectedResult60 = 4400;
        int actualResult60 = findSalary(10, 10);

        printTestResult(verifyEquals(expectedResult60, actualResult60));

//        TC7
        double expectedResult7 = 127.5;
        double actualResult7 = findCountOfGood(25.5, 5);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult7, actualResult7));

//        TC7.1
        double expectedResult70 = 127.5;
        double actualResult70 = findCountOfGood(25.5, 0);

        printTestResult(verifyEquals(expectedResult70, actualResult70));

    }


}
