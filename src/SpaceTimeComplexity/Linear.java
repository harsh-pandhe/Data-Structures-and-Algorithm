package SpaceTimeComplexity;

public class Linear { // O(n)
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        // Add 10 to the first element
        arr[0] = arr[0] + 10; // Time Complexity = O(1) Space Complexity = O(1)

        // Task: Print all elements of the array
        for (int i = 0; i < arr.length; i++) { // Time Complexity = O(n) Space Complexity = O(1)
            System.out.println(arr[i]);
        }

        System.out.println(arr[0]); // Time Complexity = O(1) Space Complexity = O(1)

        // Copy all elements of the array to another array
        int[] newArr = new int[arr.length]; // Time Complexity = O(1) Space Complexity = O(n)

        for (int i = 0; i < arr.length; i++) { // Time Complexity = O(n) Space Complexity = O(1)
            newArr[i] = arr[i];
        }

        for (int num : newArr) { // Time Complexity = O(n) Space Complexity = O(1)
            System.out.println(num);
        }

        // Total Time Complexity = O(1) + O(n) + O(1) + O(n) + O(n) = O(3n + 2) = O(n)
        // Total Space Complexity = O(1) + O(1) + O(n) + O(1) + O(1) = O(n)

    }
}
