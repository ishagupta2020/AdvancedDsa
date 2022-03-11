public class selectionSort {
    public void selectionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }


    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={5,1,10,2,9};
        selectionSort obj=new selectionSort();
        obj.printArray(arr);
        obj.selectionSort(arr);
        obj.printArray(arr);
        System.out.println("ISHA GUPTA");
        System.out.println("191500354");
    }
}


