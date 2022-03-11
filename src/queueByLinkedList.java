import java.util.NoSuchElementException;

public class queueByLinkedList {
    private listNode rear;
    private listNode front;
    private int length;
    private class listNode {
        private int data;
        private listNode next;

        listNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public queueByLinkedList() {
            this.rear = null;
            this.front=null;
            this.length=0;
    }
        public boolean isEmpty() {
            return length == 0;
        }
        public int length() {
            return length;
        }
        public void enqueue(int data) {
            listNode temp = new listNode(data);
            if (isEmpty()) {
                front = temp;
            } else {
                rear.next = temp;
            }
            rear = temp;
            length++;
        }
        public void print(){
        if(isEmpty()){
            return;
        }
        listNode current=front;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
            System.out.println("null");
        }
        public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        length--;
        return result;
        }
        public int first(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
        }
        public int last(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return rear.data;
        }


        public static void main(String[] args) {
        queueByLinkedList obj=new queueByLinkedList();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.print();
        obj.dequeue();
        obj.dequeue();
        obj.print();
            System.out.println(obj.last());
            System.out.println(obj.first());

        }
    }
