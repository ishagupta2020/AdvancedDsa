public class mergeSortedArray {
    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] sort(int []arr1,int[]arr2,int n,int m){
        int i=0; int j=0;int k=0;
        int[]result=new int[n+m];
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]arr1={1,3,5,7};
        int[]arr2={4,6,9,11};
        mergeSortedArray obj=new mergeSortedArray();
        obj.printArray(arr1);
        obj.printArray(arr2);
        int[]result=obj.sort(arr1,arr2,arr1.length,arr2.length);
        obj.printArray(result);

    }
}
