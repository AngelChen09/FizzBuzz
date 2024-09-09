public class Multiples {
    public static void main(String[] args) {

        int n = 0;
        int i = 1;

        while (i < 1000) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if ((divisibleBy3 && divisibleBy5)||(divisibleBy3)||(divisibleBy5)) {
                n++;
            }

            i++;
        }

        System.out.println(n);
    }
}
