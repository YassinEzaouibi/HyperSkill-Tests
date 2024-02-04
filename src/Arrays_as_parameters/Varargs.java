package Arrays_as_parameters;

public class Varargs {
    public static void varargsLength(int... numbers) {
        System.out.println(numbers.length);
    }

    /*
    public static void twoParametersCorrectExample(int a, int... numbers) {
        // do something
    }
    public static void twoParametersFalseExample(int... numbers, int a) {
        // do something
    }
    */

    public static void main  (String[] args) {
        varargsLength(1, 2, 3, 4, 5);
        varargsLength(1, 2, 3);
        varargsLength(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        varargsLength(new int[] { });
        varargsLength(new int[] { 2, 3 });
    }
}
