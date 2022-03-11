public class nmMatrix {
    public static void main(String[] args) {
    System.out.println(path(4,4));
}
    public static int path(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return path(m,n-1)+path(m-1,n);
    }
}




