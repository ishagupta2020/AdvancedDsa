public class minArrayDemo {
    public int minArray(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
       return min;
    }


    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[]arr={5,10,4,2,1,9,0,7};
        minArrayDemo obj=new minArrayDemo();
        obj.printArray(arr);
        System.out.println( obj.minArray(arr));


    }
}
