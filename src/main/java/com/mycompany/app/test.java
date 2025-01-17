public class BuggyCode {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // This loop is intended to calculate the sum of all elements in the array
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
