package homework;

public class HW2 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;
        String task = "Задание № ";
        String line = "______________________________";
        int count = 4;
        char subTask = 'a';

        System.out.println(line);
        System.out.println(task + count);
        System.out.println(subTask);
        System.out.println(x + "; \n" + y + "; \n" + z + ". \n");

        System.out.println(++subTask);
        System.out.println(x + ", " + y + ", " + z + ".");
        System.out.println();

        System.out.println(++subTask);
        System.out.println("x = " + x + "; \n" + "y = " + y + "; \n" + "z = " + z + ". \n");

        System.out.println(line);
        System.out.println(task + (++count));
        int sumXY = (x + y);
        int multiXZ = x * z;
        int subYZ = y - z;

        System.out.println("Sum of x and y = " + sumXY);
        System.out.println("x * z = " + multiXZ);
        System.out.println("Разность переменных y и z = " + subYZ);

        System.out.println(line);
        System.out.println(task + (++count));
        int apple = 40;
        int student = 6;
        int divAS = apple / student;
        int answer = 6 * divAS;
        int teacher = apple - answer;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + divAS + " яблок(а), и "
                + teacher + " яблок(а) останется учителю.");

        System.out.println(line);
        System.out.println(task + (++count));
        apple = 100;
        student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + (apple / student) + " яблок(а), и "
                + (apple % student) + " яблок(а) останется учителю.");


        System.out.println(line);
        System.out.println(task + (++count));
        int weightOfLemon = 6;
        int weightOfApple = weightOfLemon + 24;
        int weightOfPear = weightOfApple - 12;
        int sumOfAllFruits = weightOfLemon + weightOfApple + weightOfPear;

        System.out.println("Ответ: в школьную столовую привезли " + sumOfAllFruits + " кг фруктов.");


        System.out.println(line);
        System.out.println(task + (++count));
        int a = 40;
        int b = 8;
        int c = 5;
        int d = 7;
        int e = 2;
        int sub = a - (b + c + d + e);

        System.out.println("Ответ: " + sub + " здоровых ножек.");

        System.out.println(line);
        System.out.println(task + (++count));
        System.out.println("35 больше 7 в " + (35 / 7) + " раз.");
        System.out.println("8" + " в " + (48 / 8) + " раз меньше 48.");
        System.out.println("54 больше 6 на " + (54 - 6) + " раз.");

        subTask = 'a';
        System.out.println(line);
        System.out.println(task + (++count));
        System.out.println(subTask + ") " + (48 % 8));
        System.out.println(++subTask + ") " + (48 % 2) + ", " + (8 % 2));
        System.out.println(++subTask + ") " + (47 % 2) + ", " + (49 % 2));
        System.out.println(++subTask + ") " + (48 % 7) + ", " + (8 % 7)
                + ", " + (47 % 7) + ", " + (49 % 7));

        System.out.println(line);
        System.out.println(task + (++count));

        int k = 5;
        int l = 7;
        int m = 8;
        System.out.println("________________________________________________________________");
        System.out.println("|\t\t| + 10 | -5  | *100 |  /2  |  %2  |  ^2  |  ++  |  --  |");
        System.out.println("________________________________________________________________");
        System.out.println("| k = 5 |  " + (k + 10) + "  |  " + (k - 5) + "  | " + (k * 100)
                + "  |  " + (k / 2) + "   |  " + (k % 2) + "   |  " + (k * k++) + "  |  " + (k--)
                + "   |  " + (--k) + "   |");
        System.out.println("________________________________________________________________");
        System.out.println("| l = 7 |  " + (l + 10) + "  |  " + (l - 5) + "  | " + (l * 100)
                + "  |  " + (l / 2) + "   |  " + (l % 2) + "   |  " + (l * l) + "  |  " + (++l)
                + "   |  " + (--l - 1) + "   |");
        System.out.println("________________________________________________________________");
        System.out.println("| m = 7 |  " + (m + 10) + "  |  " + (m - 5) + "  | " + (m * 100)
                + "  |  " + (m / 2) + "   |  " + (m % 2) + "   |  " + (m * m) + "  |  " + (++m)
                + "   |  " + (--m - 1) + "   |");
        System.out.println("________________________________________________________________");

        System.out.println(line);
        System.out.println(task + (++count));
        x = 7;
        y = 18;
        int n = 3;

        System.out.println(x * x * x * ((5 * x + 7 * y) % (8 * x + 10 * y)) / ((3 * x - y) % (x + y)));
        System.out.println(x * x * x * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y)));

        x = 7;
        y = 18;
        n = 3;
        System.out.println(x * x * x * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y)));


    }
}
