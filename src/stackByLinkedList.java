import java.util.EmptyStackException;

public class stackByLinkedList {
    private listNode top;
    private int length;
    private class listNode {
        private int data;
        private listNode next;

        public listNode(int data) {
            this.data = data;
        }
    }
        public stackByLinkedList(){
        top=null;
        length=0;
    }
    public void push(int data){
        listNode temp=new listNode(data);
        temp.next=top;
        top=temp;
        length++;

    }
    public int pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    // peek->last inserted data
    public int peek(){
        if(top==null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        stackByLinkedList obj=new stackByLinkedList();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());



    }
}
