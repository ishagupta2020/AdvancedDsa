public class maxPQ {
    private Integer[]heap;
    private int n;
    public maxPQ(int capacity){
        heap=new Integer[capacity+1];
        n=0;

    }
    public boolean isEmpty(){

        return n==0;
    }
    public int size(){

        return n;
    }
    public  void insert(int x) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);

        }
        n++;
        heap[n] = x;
        swim(n);
    }
        public void swim ( int k){
            while (k > 1 && heap[k / 2] < heap[k]) {
                int temp = heap[k];
                heap[k] = heap[k / 2];
                heap[k / 2] = temp;
                k=k/2;
            }
        }

    public void resize(int capacity){
        Integer[]temp=new Integer[capacity];
        for(int i=0;i<heap.length;i++) {
            temp[i] = heap[i];
        }
            heap=temp;
        }
    public void printMaxHeap(){
        for(int i=1;i<heap.length;i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        maxPQ obj=new maxPQ(4);
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        obj.insert(9);
        obj.insert(10);
        obj.insert(8);
        obj.insert(7);
        obj.insert(11);
        obj.insert(4);
        obj.insert(6);
        obj.insert(3);
        System.out.println(obj.size());
        obj.printMaxHeap();

    }
}
