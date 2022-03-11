public class powerByRecursion {

    public static void main(String[] args) {
        System.out.println(power(5, 6));
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            if (b % 2 != 0) {
                return power(a, b - 1);
            } else {
                return power(a * a, b / 2);
            }
        }
    }
}
