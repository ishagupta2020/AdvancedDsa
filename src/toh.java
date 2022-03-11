public class toh {
    public static void main(String[]args){
        toh(3,"S","D","H");

    }
    public static void toh(int n,String src,String dest,String help){
        if(n==0){
            return;
        }
        toh(n-1,src,help,dest);
        System.out.println("move " +  n + " disk from" + src + " to " + dest);
        toh(n-1,help,dest,src);
    }
}

