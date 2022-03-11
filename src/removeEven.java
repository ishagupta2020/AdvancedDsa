public class removeEven {


public void printArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();

}
public int [] removeEvenElements(int []arr){
    int oddCount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            oddCount++;
        }
    }
    int [] result=new int[oddCount];
    int index=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            result[index]=arr[i];
            index++;
        }
    }
   return result;
}
public static void main(String[] args) {
        removeEven obj=new removeEven();
        int []arr={7,4,3,2,10,9};
        obj.printArray(arr);
        int[]result= obj.removeEvenElements(arr);
        obj.printArray(result);


    }
}
