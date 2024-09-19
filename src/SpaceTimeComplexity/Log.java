package SpaceTimeComplexity;

public class Log { // O(log n)
    public static void main(String args[]) {
        // Binary Search
        int[] arr = new int[] { 2, 5, 10, 20, 40, 60 };

        var ST = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 40) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }
        var ET = System.nanoTime();

        System.out.println("Time taken: " + (ET - ST) + " ns");

        var startTime = System.nanoTime();
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == 40) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (arr[mid] < 40) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        var endTime = System.nanoTime();

        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }
}
