public class solution {

        // Function to find the peak element
        // arr[]: input array
        // n: size of array a[]
        public int peakElement(int[] arr,int n)
        {

            int max=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }

            }
            //add code here.
            return max;
        }

        public static void main(String args[]){
            int arr[]={1,2,3};
            solution obj=new solution();

            obj.peakElement(arr,3);
            if(obj.peakElement(arr,3)==3){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }


