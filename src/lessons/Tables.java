package lessons;

public class Tables {
    static String line = "______________________________________";
//    public static void print(String) {
//
//    }
//
//    public static void print(String l) {
//        System.out.println(l);
//    }


//    static String Line = "____________________________________";

//    public static void methodMain() {
//
//    }
//
//    public static void methodName(type argsName, type argsName){
//
//    }

//    public static void printLine() {
//        System.out.println("\t________________________________________________________________________\n");
//
//    }
//
//    public static void print(String text) {
//        System.out.println(text);
//            print("hi");
//
//    }

//    public static void main(String[] args) {
//
//        print("abcd");
//    }

    public static void print(String line) {
        System.out.println(line);
    }

    public static void main(String[] args) {
        String hi = "Hello!";
        print(line);
        print("Task #");
        print(hi);

        int k = 5;
        int l = 10;
        int m = 15;

        String line = "\t________________________________________________________________________________\n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";

        System.out.println(
                line
                        + vLine + tab
                        + vLine + "+10"
                        + vLine + "-5"
                        + vLine + "*100"
                        + vLine + "/2"
                        + vLine + "%2"
                        + vLine + "^2"
                        + vLine + "++"
                        + vLine + "--"
                        + endLine
        );
        System.out.print(
                line
                        + vLine + "k = " + k
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + " "
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = l;

        System.out.print(
                line
                        + vLine + "l = " + l
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = m;

        System.out.print(
                line
                        + vLine + "m = 15"
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);
        System.out.println(line);

    }

}

