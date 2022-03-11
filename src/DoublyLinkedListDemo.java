import java.util.NoSuchElementException;

public class DoublyLinkedListDemo
{
    private ListNode head;
    private ListNode tail;
    private int length;
    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }
        public DoublyLinkedListDemo(){
           this.head=null;
           this.tail=null;
           this.length=0;
        }
        public boolean isEmpty() {
        return length==0;
}
      public int length(){

        return length;
        }
        // to print elements of doubly linked list
    public void displayForward(){
        if(head==null){
            return ;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if(head==null){
            return;
        }
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.previous;
        }
        System.out.println("null");
    }
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }
            else{
                tail.next=newNode;
                newNode.previous=tail;

            }
            tail=newNode;
            length++;

        }
        public ListNode deleteFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            ListNode temp = head;
            if (head == tail) {
                tail = null;

            } else {
                head.next.previous = null;
            }
            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }
        public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=tail;
        if(head==null) {
            head = null;
        }
            else{
                tail.previous.next=null;
            }
            tail=tail.previous;
            temp.previous=null;
            length--;
            return temp;


        }







    public static void main(String[] args) {
        DoublyLinkedListDemo dll=new DoublyLinkedListDemo();
     //   dll.insertFirst(1);
      //  dll.insertFirst(2);
     //   dll.insertFirst(3);
     //   dll.insertFirst(4);
        dll.displayForward();
        dll.displayBackward();
        dll.insertLast(5);
        dll.insertLast(6);
        dll.insertLast(7);


        dll.displayForward();
        dll.displayBackward();
//dll.deleteFirst();
//dll.deleteFirst();
//dll.displayForward();
dll.deleteLast();
dll.displayForward();



    }

    }
