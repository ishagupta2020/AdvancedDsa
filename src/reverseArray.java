public class reverseArray{
    public void reverseArrayDemo(int[]arr,int start,int end){
        for(int i=0;i<arr.length;i++){
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;

            }
        }
    }




    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        reverseArray obj=new reverseArray();
        int[]arr={5,9,4,3,2,9,10};
        obj.printArray(arr);
        obj.reverseArrayDemo(arr,0,6);
        obj.printArray(arr);



    }
}
