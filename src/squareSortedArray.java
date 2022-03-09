
public class squareSortedArray {
    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] sortedArray(int[]arr) {
            int i = 0;
            int j = arr.length - 1;
            int[] result = new int[arr.length];
            for (int k = arr.length - 1; k >= 0; k--) {
                if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                    result[k] = arr[i] * arr[i];
                    i++;

                } else {
                    result[k] = arr[j] * arr[j];
                    j--;
                }
            }
                return result;
            }



        public static void main(String[] args) {
            int[]arr={-4,-1,0,3,10};
        squareSortedArray obj=new squareSortedArray();
        obj.printArray(arr);
       int[]result= obj.sortedArray(arr);
        obj.printArray(result);

    }
    }




