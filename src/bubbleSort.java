public class bubbleSort {
    public void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public void sort(int[]arr){
        boolean isSwapped;
        for(int i=0;i<arr.length-1;i++){
            isSwapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[]arr={5,2,8,10,3,1};
        bubbleSort obj=new bubbleSort();
        obj.printArray(arr);
        obj.sort(arr);
        obj.printArray(arr);
        System.out.println("ISHA GUPTA");
        System.out.println("191500354");

    }
}
