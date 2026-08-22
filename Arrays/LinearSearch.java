/**
 * Problem:
 * Given an array of integers and a target value, find the index of the first
 * occurrence of the target element. If the target does not exist, return -1.
 *
 * Approach:
 * Sequentially iterate through the array from start to end, checking if the
 * current element matches the target. Return the index immediately when found,
 * or return -1 if the loop terminates without finding the target.
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}