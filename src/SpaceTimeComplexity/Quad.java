package SpaceTimeComplexity;

public class Quad {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 5, 10, 0, 5, 6, 25, 30 };
        // int target = 10;
        int target = 9;
        // Find the Pairs whose sum is = target (10)
        for (int i = 0; i < arr.length; i++) { // Time Complexity = O(n)
            for (int j = i + 1; j < arr.length; j++) { // Time Complexity = O(n)
                if (arr[i] + arr[j] == target) { // Time Complexity = O(1)
                    System.out.println("Pairs:  " + arr[i] + " and " + arr[j]); // Time Complexity = O(1)
                }
            }
        }
    }
}