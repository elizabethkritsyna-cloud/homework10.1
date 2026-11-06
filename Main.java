public class Main {

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("1. Квадрат числа 5 дорівнює " + result);
        double volume = cylinderVolume(3.5, 10.0);
        System.out.println("2. Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює " + volume);
        int[] numbers = {10, 20, 30, 40, 50};
        int total = sumArray(numbers);
        System.out.println("3. Масив чисел: " + java.util.Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює " + total);
        String text = "Hello, World!";
        String reversed = reverseString(text);
        System.out.println("4. Введіть рядок: " + text);
        System.out.println("Рядок в зворотному порядку: " + reversed);
        int powerResult = power(2, 3);
        System.out.println("5. Результат 2^3 дорівнює " + powerResult);
        repeatText(4, "Java програмування");
    }
    public static int square(int number) {
        return number * number;
    }
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }

    }

}