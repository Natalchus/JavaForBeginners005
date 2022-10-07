package lessons;

public class Lesson2 {

    public static void main(String[] args){

        String line = "______________________________";
        String task = "Задание № ";
        int count = 1;
//
////        System.out.println(task  + count);
////        /* Создать переменную типа int...
////         */
////        int a = 1;
////        System.out.println(a);
////        System.out.println(line);
////        System.out.println(task  + (++ count));
////        /* Создать переменную типа int...
////         */
////
////        System.out.println(line);
////        System.out.println(task  + (++ count));
////        /* Создать переменную типа int...
////         */
////
////        System.out.println(line);
//
//        int a = +5;
//        int b = -5;
//        int c = 5;
////        String s = "+ 5";
//
//        System.out.println(a + b);
//
//        int sumAB = (a + b);
//        int sumBC = (b + c);
//
//        System.out.println(" " + a);
//        System.out.println(b);
//        System.out.println(" " + sumAB);
////        System.out.println(s);
//
//        int subAB = a - b;
//        int subBA = b - a;
//        int subBC = b - c;
//
//        int task3solution = sumBC + subAB;
//        int tasksolution = sumBC + subBC;
//        System.out.println(subAB);
//
//        int multiAB = a * b;
//        int divAB = a / b;
//        int remAB = a % b;
//
//        System.out.println(11 / 5);
//        System.out.println(11 % 5);
//
//        System.out.println(7787532 % 7);
//        System.out.println(7787531 % 7);
//        System.out.println(7787527 % 7);

//        b = -5
//        c = 5
//        System.out.println(b++); -4
//        System.out.println(c++); 5
//
//        System.out.println(++b); -3
//        System.out.println(++c); 7
//
//        int tempB = 5;

System.out.println(task + count);

int boxOfCandies = 4;
int weightForOneBoxOfCandies = 9;
int boxOfCookies = 3;
int weightForOneBoxOfCoocies = 8;

int weightForAllBoxes;
        weightForAllBoxes = boxOfCandies * weightForOneBoxOfCandies
                + boxOfCookies * weightForOneBoxOfCoocies;
        System.out.println(weightForAllBoxes + " кг конфет и печенья привезли в детский сад.");



    }
}
