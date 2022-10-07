package schooll;

public class Person {

    public static void main(String[] args) {

       int yob = 1989;

       System.out.println("Если человек родился в " + yob + ", то его возраст - " + (2022 - yob));
       System.out.println();

        int yob1 = 1984;


        System.out.println("Если человек родился в " + yob1 + " году, " +
                "то его возраст 2 года назад - " + (2022 - 2 - yob1));
    }
}