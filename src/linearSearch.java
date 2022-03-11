public class linearSearch {
    public int linearSearch(int[]arr,int x){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            return i;
        }
    }
    return -1;
}



    public static void main(String[] args) {
        int[] arr ={1,7,10,9,0} ;
        linearSearch obj=new linearSearch();
        System.out.println(obj.linearSearch(arr,9));
    }

}
