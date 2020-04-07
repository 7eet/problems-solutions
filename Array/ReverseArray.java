public class ReverseArray {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int lengthOfArray = input.nextInt();
        int[] inputArray = new int[lengthOfArray];
        System.out.println("\nEnter elements:");
        for (var loop = 0; loop < lengthOfArray; loop++) {
            inputArray[loop] = input.nextInt();
        }

        int[] resultArray = reverseIt(inputArray);
        System.out.println("\nReversed Array is: ");
        printArray(resultArray);
    }

    private static int[] reverseIt(int[] in) {
        int[] resultArray = new int[in.length];
        int count = 0;
        for (var loop = (in.length-1); loop >= 0; loop--) {
            resultArray[count] = in[loop];
            count++;
        }

        return resultArray;
    }

    private static void printArray(int[] in) {
        for (var each: in) {
            System.out.println(each);
        }
    }
}