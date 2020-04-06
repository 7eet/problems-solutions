import java.util.Arrays;

public class ArrayLeftRotation {

    private static int[] left(int[] a, int d) {
        int lengthOfArray = a.length;
        if (d == 0) {
            return a;
        }
        else if (d <= lengthOfArray) {
            return leftRotation(a,d);
        }
        else {
            d = d - lengthOfArray;
            return leftRotation(a,d);
        }
    }

    private static int[] leftRotation(int[] arr, int rotate) {
        int[] result = new int[arr.length];
        
        for (int loop = 0; loop < arr.length; loop++) {
            int leftR = loop - rotate;

            if (leftR < 0) {
                result[arr.length + leftR] = arr[loop];
            }
            else {
                result[leftR] = arr[loop];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner takeInput = new java.util.Scanner(System.in);
        System.out.print("Enter length of array- ");
        int lengthOfArray = takeInput.nextInt();

        int[] inputArray = new int[lengthOfArray];
        System.out.println("Enter elements");
        for (int loop = 0; loop < lengthOfArray; loop++) {
            inputArray[loop] = takeInput.nextInt();
        }

        System.out.print("Enter number of left rotation- ");
        
        int leftRotate = takeInput.nextInt();

        int[] result = left(inputArray,leftRotate);

        System.out.println("Result is ");

        printArray(result);
    }

    private static void printArray(int[] ar) {
        for (int each: ar) {
            System.out.println(each);
        }
    }
}