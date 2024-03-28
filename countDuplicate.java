import java.util.*;
import java.io.*;
public class countDuplicate{
    public static int countOccurrences(int[] arr, int x)
     {
        int firstIndex = binarySearch(arr, x, true);
        if (firstIndex == -1) {
            return 0;
        }

        int lastIndex = binarySearch(arr, x, false);
        return lastIndex - firstIndex + 1;
    }
    public static int binarySearch(int[] arr, int x, boolean findFirst)
     {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                if (findFirst) {
                    if (mid == 0 || arr[mid - 1] != x) {
                        return mid;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (mid == arr.length - 1 || arr[mid + 1] != x) {
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                }
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,5,5,6,6,8,9,9,9};
        int x = 5;

        int count = countOccurrences(arr, x);
        if (count == 0) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Number of occurrences of " + x + " in the array is " + count);
        }
    }

}

   