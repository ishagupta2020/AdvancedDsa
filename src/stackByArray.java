public class stackByArray {
    int top;
    int size;

    int[]arr;
    public stackByArray(){
        top=-1;
        size=10;
        arr=new int[size];
    }
    public boolean isEmpty(){

        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("overflow");
        }
        top=top+1;
        arr[top]=data;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("underflow");
        }
        return arr[top--];
    }
    public int peek(){
        return arr[top];

    }


    public static void main(String[] args) {
        stackByArray obj=new stackByArray();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());

    }
}
