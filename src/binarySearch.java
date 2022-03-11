public class binarySearch {
    public int binarySearch(int[]arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int  mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(key<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={10,6,8,3,0,4,9};
        binarySearch obj=new binarySearch();
        System.out.println(obj.binarySearch(arr,4));
        System.out.println("ISHA GUPTA");
        System.out.println("191500354");
    }

}
