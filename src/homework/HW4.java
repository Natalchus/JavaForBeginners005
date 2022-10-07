package homework;

public class HW4 {
    public static void print(int a) {
        System.out.println("***" + a + "***");
    }

    public static void main(String[] args) {
        print(2);
        print(3);
        String sosna = "Сосна";
        String dub = "Дуб";
        String vishnya = "Вишня";
        String klyen = "Клён";
        String a = "Глаза даны, чтобы видеть";
        String b = "Под третьим этажом находится второй этаж";

        System.out.println("1) " + ((2 == 2) && (7 == 7)));
        System.out.println("2) " + (!(15 < 3)));
        System.out.println("3) " + ((sosna == dub) || (vishnya == klyen)));
        System.out.println("4) " + (!(sosna == dub)));
        System.out.println("5) " + ((!(15 < 3)) && (10 > 20)));
        System.out.println("6) " + a.equals(b));
        System.out.println("7) " + ((6 / 2 == 3) || (7 * 5 == 20)));

        print(4);

        int ageA = 15;
        int ageN = 18;
        int ageS = 20;
        System.out.println("а) " + ((ageS < ageA) && (ageS < ageN)));

        String uch = "учебники";
        String sprav = "справочники";
        System.out.println("б) " + uch.equals(sprav));

        int dev = 3;
        int mal = 2;

        System.out.println("в) " + (dev > mal));

        print(5);
        int age = 16;
        int id = 16;
        System.out.println(id >= age);

        print(6);

        int petya = 1;
        int bus = 2;
        int book = 3;
        int window = 4;

        System.out.println((petya != bus) && ((petya == book) || (petya != window)));

        print(7);

        String c = "friend";
        String d = "you";

        int friend = 1;
        int you = 2;

        if (friend + you > 2) {
            System.out.println("good");
        } else {
            System.out.println("bed");
        }
//        if (c == d) {
//            System.out.println("good");
//        } else {
//            System.out.println("bed");
//        }

        print(8);

        int x = 10;

        if (x > 10) {
            System.out.println("x больше 10");
        } else if (x < 0) {
            System.out.println("x - отрицательное число");
        } else if (x == 5) {
            System.out.println("Разность х и 5 равна 0");
        } else {
            System.out.println("Число х меньше 11, больше или равно 0, но не равно 5");
        }

        print(9);

        int p = 59;

        if (p % 2 == 0) {
            System.out.println(p * 2);
        } else {
            System.out.println(p * p);
        }

        print(10);

        int t = 18;
//        тест на валидность
        if (t >= 0 && t <= 150) {

            if (t >= 18); {
                System.out.println("a) можно голосовать");
            }
            if (t >= 16) {
                System.out.println("б) можно водить");
            }
            if (t >= 5) {
                System.out.println("в) можно ходить в школу");
            }
            } else {
                System.out.println("ввести корректный возраст");
        }

        print(11);

        int l = 5;
        if (l >= 2 && l < 6 ) {
            if (l == 5) {
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            } else if (l == 4) {
                System.out.println("перевести в следующий класс");
            } else if (l == 3) {
                System.out.println("дать задание на лето и перевести в следующий класс");
            } else if (l == 2) {
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            } else {
                System.out.println("ввести корректную оценку");
            }
        }



//        Напишите метод, который примет на вход температуру в Цельсиях, и распечатает результат
//        температуры в Цельсиях и в Фаренгейтах.
//
//
//        Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа, которые
//        делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка. ПРограмма
//        выводит на печать результат вычислений.
//        Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число
//        отрицательное, программа умножает результат действия на (-1). ПРограмма выводит на печать результат вычислений.
//       Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
//
//
//        Распечатать следующие выражения, используя метод и параметры k, l, m:
//        Результат деления k на l = …, а остаток от деления  = …
//        Результат деления k на m = …, а остаток от деления  = …
//        Результат деления l на m = …, а остаток от деления  = …
//        Результат деления m на k = …, а остаток от деления  = …
//
//

    }
}
