package homework;

public class HW3 {
    public static void main(String[] args) {

        String task = "Task ";
        String line = "*********************";
        int number = 2;

        System.out.println(line);
        System.out.println(task + number);
        byte a = 17;
        byte b = -9;

        System.out.println(line);
        System.out.println(task + (++number));
        short s = -30000;
        short t = 30000;

//        Task 4
        System.out.println(line);
        System.out.println(task + (++number));
        int i1 = -2147483648;
        int i2 = 2147483647;
        String line1 = "-----------------------";
        String line2 = "|";

        System.out.println(line2 + line1 + line2 + line1 + line2);
        System.out.print(line2);
        System.out.println("int min" + "\t\t\t\t" + line2 + i1 + "\t\t\t" + line2 + "\n"
                + line2 + line1 + line2 + line1 + line2);
        System.out.println(line2 + "int min" + "\t\t\t\t" + line2 + i2 + "\t\t\t\t" + line2);
        System.out.println(line2 + line1 + line2 + line1 + line2);

        //        Task 5
        System.out.println(line);
        System.out.println(task + (++number));
        long phoneNumber = 6462555555L;

        //        Task 6
        System.out.println(line);
        System.out.println(task + (++number));
        float f = 100.101101f;
        double d = 100.101101;
        String a1 = "float f = 100.101101F";
        String b1 = "double d = 100.101101D";

        System.out.println(line2 + line1 + line2 + line1 + line2);
        System.out.print(line2);
        System.out.println(a1 + "\t" + line2 + f + "\t\t\t\t" + line2 + "\n"
                + line2 + line1 + line2 + line1 + line2);
        System.out.println(line2 + b1 + "\t" + line2 + d + "\t\t\t\t" + line2);
        System.out.println(line2 + line1 + line2 + line1 + line2);

//        Task 7
        char subTask = 'a';
        char dop = ')';

        System.out.println(line);
        System.out.println(task + (++number));
        System.out.print(subTask + "" + dop);
        Double dd = new Double(10.09999 + 20.099999);
        Float ff = new Float(10.09999 + 20.099999);
        System.out.println(" " + dd);

//        double dd = 10.09999 + 20.099999;
//        System.out.println(dd);
        System.out.print(++subTask + "" + dop);
        System.out.println(" " + ff);

//        float ff = 10.09999f + 20.099999f;
//        System.out.println(ff);
        {
            //        Task 8
            System.out.println(line);
            System.out.println(task + (++number));
            ff = 10f / 3f;
            dd = 10d / 3d;
            System.out.println(ff);
            System.out.println(dd);
        }
        //        Task 9
        System.out.println(line);
        System.out.println(task + (++number));
        Float floatSum = new Float(f + ff);
        Float floatSub = new Float(f - ff);
        Float floatProduct = new Float(f * ff);
        Float floatQuotient = new Float(f / ff);
        Float floatRemainder = new Float(f % ff);

        System.out.println(floatSum);
        System.out.println(floatSub);
        System.out.println(floatProduct);
        System.out.println(floatQuotient);
        System.out.println(floatRemainder);

//        float Sum = f + ff;
//        float Sub = f - ff;
//        float Product = f * ff;
//        float Quotient = f / ff;
//        float Remainder = f % ff;
//
//        System.out.println(Sum);
//        System.out.println(Sub);
//        System.out.println(Product);
//        System.out.println(Quotient);
//        System.out.println(Remainder);


        //        Task 10
        System.out.println(line);
        System.out.println(task + (++number));
        Double doubleSum = new Double(d + dd);
        Double doubleSub = new Double(d - dd);
        Double doubleProduct = new Double(d * dd);
        Double doubleQuotient = new Double(d / dd);
        Double doubleRemainder = new Double(d % dd);

        System.out.println(doubleSum);
        System.out.println(doubleSub);
        System.out.println(doubleProduct);
        System.out.println(doubleQuotient);
        System.out.println(doubleRemainder);

        //        Task 11
        System.out.println(line);
        System.out.println(task + (++number));

        System.out.println(line2 + "--" + line1 + line1 + line1 + line2);
        System.out.println(line2 + "f=" + f + "\t" + line2 + "ff=" + ff + "\t" + line2
                + "d=" + d + "\t" + line2 + "dd=" + dd + "\t" + line2);
        System.out.println(line2 + "--" + line1 + line1 + line1 + line2);
        System.out.println(line2 + "floatSum=" + floatSum + "\t\t\t\t" + line2
                + "doubleSum=" + doubleSum + "\t\t\t" + line2 + "\n"
                + line2 + "floatSub=" + floatSub + "\t\t\t\t" + line2
                + "doubleSub=" + doubleSub + "\t\t\t" + line2 + "\n"
                + line2 + "floatProduct=" + floatProduct + "\t\t\t" + line2
                + "doubleProduct=" + doubleProduct + "\t\t" + line2 + "\n"
                + line2 + "floatQuotient=" + floatQuotient + "\t\t" + line2
                + "doubleQuotient=" + doubleQuotient + "\t\t\t\t" + line2 + "\n"
                + line2 + "floatRemainder=" + floatRemainder + "\t\t" + line2
                + "doubleRemainder=" + doubleRemainder + "\t" + line2 + "\n"
                + line2 + "--" + line1 + line1 + line1 + line2);

        //        Task 12
        System.out.println(line);
        System.out.println(task + (++number));

        char dot = '.';
        System.out.println(dot + "\t" + dot + "\t" + dot + dot + dot + dot + "\t" + dot + "\t\t"
                + dot + "\t\t\t" + dot + dot + "\n"
                + dot + "\t" + dot + "\t" + dot + "\t\t" + dot + "\t\t"
                + dot + "\t\t" + dot + "\t\t" + dot + "\n"
                + dot + dot + dot + dot + dot + "\t" + dot + dot + dot + dot + "\t" + dot + "\t\t"
                + dot + "\t\t" + dot + "\t\t" + dot + "\n"
                + dot + "\t" + dot + "\t" + dot + "\t\t" + dot + "\t\t"
                + dot + "\t\t" + dot + "\t\t" + dot + "\n"
                + dot + "\t" + dot + "\t" + dot + dot + dot + dot + "\t" + dot + dot + dot + dot + "\t"
                + dot + dot + dot + dot + "\t\t" + dot + dot);

        System.out.println(line);
        System.out.println(task + (++number));
//
//        Task 13
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505f;
        Integer t5 = 100100;
        Long t6 = 100010001000l;
        Double t7 = 2.66666666666666;
        Float t8 = -1000000.001F;
        Short t9 = 1010;

        System.out.println(t1 + "\n" + t2 + "\n" + t3 + "\n" + t4 + "\n" + t5 + "\n"
                + t6 + "\n" + t7 + "\n" + t8 + "\n" + t9);

        //Task 15
        System.out.println(line);
        System.out.println(task + (++number));
        System.out.println(line);
        System.out.println(task + (++number));
        Integer num1 = 500;
        Integer num2 = 500;

        System.out.println(num1 == num2);
        System.out.println("Если num1 равно num2, то результат сравнения методом .equals() = "
                + num1.equals(num2));

        num1 = 600;
        num2 = 200;

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = "
                + num1.equals(num2));

        //Task 16
        System.out.println(line);
        System.out.println(task + (++number));
        System.out.print(--subTask + "" + dop + "\t");
        int number1 = 555;
        int number2 = 555;
        System.out.println("Если number1 = number2, то результат сравнения методом .compare() ="
                + Integer.compare(number1, number2));

        number1 = 444;
        System.out.print(++subTask + "" + dop + "\t");
        System.out.println("Если number1 < number2, то результат сравнения методом .compare() ="
                + Integer.compare(number1, number2));

        number1 = 666;
        System.out.print(++subTask + "" + dop + "\t");
        System.out.println("Если number1 < number2, то результат сравнения методом .compare() ="
                + Integer.compare(number1, number2));

        //Task 17
//        Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int

    }


}
