package lessons;

public class Lesson4 {
    public static void main(String[] args) {
//Андрей старше Светы и Наташа старше Светы
//
//        int ageA = 25;
//        int ageN
//        int ageS
//
//        (ageA > ageS) && (ageN > ageS);


//        int a = 25;
//        int b = 7;
//
//        System.out.println(5 > 7);
//        System.out.println((a > b) || (a < b));
//        System.out.println((a > b) && (a < b));
//
//        System.out.println(a !=b);
//        System.out.println(!(a == b));

        //if-then
//        if () {
//
//        }
        //если а равно b, то сложить a и b
//        if (a == b) {
//            System.out.println(a + b);
//        }


        //if - else
        //если а равно b, то сложить a и b, а иначе вычесть из a значение b

//        if (a == b) {
//            System.out.println(a + b);
//        } else {
//            System.out.println(a - b);
//        }

        //if - else if - else
//       если а равно b, то сложить a и b, если же a > b, то присвоить a значение b, а иначе вычесть из a значение b
//        if () {
//
//        } else
//        if (a == b) {
//            System.out.println(a + b);
//        } else if (a > b) {
//            a = b;
//            System.out.println(a);
//        } else {
//            System.out.println(a - b);
//        }

//     Если a > b или b < c, то присвоить a значение 7, и сложить b и с, иначе присвоить a значение 10
//        int a = 0;
//        int b = 7;
//        int c = 25;
//
//        if ((a > b) || (b < c)) {
//            a = 7;
//            int sum = b + c;
//            System.out.println("a =" + a);
//            System.out.println("sum =" + sum);
//        } else {
//            a = 10;
//            System.out.println("a =" + a);
//        }

        int n = 43;

//        на четность ==
//        на нечетность !=
        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 !=0)) {
            n = 10;
        } else if ((n % 2 == 0) && (100 % n == 0)) {
            n = 100;
        }

//        Test
        int expectedResult = 10;
        int actualResult = n;
        if (n == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        Integer x = 12;
        Integer y = 20;

        System.out.println(x.equals(y));
        System.out.println(!(x.equals(y)));

        String hi1 = "Hi";
        String hi = "Hi";
        System.out.println(hi.equals(hi));
        }


    }

