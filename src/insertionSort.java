public class insertionSort {
    public void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int  j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }

    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={8,2,9,5,4,3};
        insertionSort obj=new insertionSort();
        obj.printArray(arr);
        obj.insertionSort(arr);
        obj.printArray(arr);
        System.out.println("ISHA GUPTA");
        System.out.println("191500354");
    }
}


