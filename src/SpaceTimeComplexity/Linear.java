package SpaceTimeComplexity;

public class Linear { // O(n)
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        // Task 1: Print the elements of an Array
        for (int i = 0; i <= arr.length; i++) { // O(n) - Linear Time Complexity
            System.out.println(arr[i]);
        }
    }
}
