public class printDecreasing {
    public static void main(String[] args) {
        printDec(4);
    }
    public static void printDec(int n){
        if(n==0)
            return;
        System.out.println(n);
        printDec(n-1);

    }
}


