public class moveZeroToEnd {
    public void moveZeros(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr);
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[]arr={4,5,0,7,0,3,0,1,9};
         printArray(arr);
         moveZeros(arr);
         printArray(arr);
    }
    public static void main(String[] args) {
        moveZeroToEnd obj=new moveZeroToEnd();
        obj.arrayDemo();

    }
}
