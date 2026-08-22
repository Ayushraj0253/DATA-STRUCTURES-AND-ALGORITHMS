/**
 * Problem:
 * Given a sorted array of integers and a target value, find the index
 * of the target element. If the target does not exist in the array, return -1.
 *
 * Approach:
 * Iterative Binary Search on a sorted array. Maintain 'start' and 'end' pointers,
 * calculate the middle index using mid = start + (end - start) / 2 (preventing integer overflow),
 * and narrow the search space to the left or right half based on comparison with the target.
 *
 * Time Complexity:
 * O(log n)
 *
 * Space Complexity:
 * O(1)
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;          // target found
            }
            else if (arr[mid] < target) {
                start = mid + 1;     // search right half
            }
            else {
                end = mid - 1;       // search left half
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
