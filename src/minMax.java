public class minMax {

    public int minElement(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public int maxElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }



        public static void main(String[] args) {
            int[] arr = {4, 6, 2, 8, 9, 6};
            minMax obj = new minMax();
            int smallestElement = obj.minElement(arr, 6);
            System.out.println("smallestElement: " + smallestElement);
            int largestElement = obj.maxElement(arr, 6);
            System.out.println("largestElement: " + largestElement);

        }
    }




