public class arrayDemo {
    public void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDisplay(){
        int [] myArray=new int[5];
        myArray[0]=5;
        myArray[1]=2;
        myArray[2]=6;
        myArray[3]=7;
        myArray[4]=9;
        myArray[3]=10;
      //  myArray[5]=1;
        printArray(myArray);
        System.out.println(myArray[myArray.length-1]);

    }

    public static void main(String[] args) {
        arrayDemo obj=new arrayDemo();
        obj.arrayDisplay();
    }

}
