public class Main {
    public static void main(String[] args) {
        double[] array = {8.0, 2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.0, 2.0, 3.0, 4.0, 5.0, -1.0, -2.0, -3.0}; // Заданный массив чисел

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double num : array) {
            if (num < 0 && !foundNegative) {
                foundNegative = true;
                continue;
            }
            if (foundNegative && num > 0) {
                sum += num;
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}