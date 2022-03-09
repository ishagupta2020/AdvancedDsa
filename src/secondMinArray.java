public class secondMinArray {
        int findSecondMax(int[]arr){
          int  max=Integer.MIN_VALUE;
          int secondMax=Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++){
             if(arr[i]>max) {
                 secondMax=max;
                 max=arr[i];
             }
             else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i] ;
             }
            }
          return secondMax;
        }



       public static void main(String[]args) {
            secondMinArray obj=new secondMinArray();
            int[]arr={13,10,32,33,34,1};
           int result= obj.findSecondMax(arr);
           System.out.println(result);

        }
    }


