package day8;

public class Task1 {
    public static void main(String[] args) {
        String testString = "0";
        StringBuilder sb = new StringBuilder("0");

        long start = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            testString = testString + " " + i;
        }
        long finish = System.currentTimeMillis();

        System.out.println("+: " + (finish -start));

        start = System.currentTimeMillis();

        for (int i = 1; i <= 20000; i++) {
            sb.append(" ");
            sb.append(i);
        }

        finish = System.currentTimeMillis();

        System.out.println("sb: " + (finish -start));

//        System.out.println(sb.toString());

    }
}
