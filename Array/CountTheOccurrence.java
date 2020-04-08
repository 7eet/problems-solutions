public class CountTheOccurrence {
    private static int[] array;
    public static void main(String[] args) {
        var takeInput = new java.util.Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int lengthOfArray = takeInput.nextInt();
        System.out.println("\nEnter elements: ");
        array = new int[lengthOfArray];
        for (var loop = 0; loop < lengthOfArray; loop++) {
            array[loop] = takeInput.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = takeInput.nextInt();
        int result = countOccurrence(array, target);
        System.out.println("The occurrence of " + target + " in array is " + result);
    }

    private static int countOccurrence(int[] arr, int target) {
        int counter = 0;
        for (int each: arr) {
            if (each == target) {
                counter++;
            }
        }
        return counter;
    }
}