public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
        // Print the element of linked list
    public void display(){
        if(head==null){
            return;
        }
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + " ->");
            current=current.next;
        }
        System.out.println("null");
    }
    // print the length of singlylinkedlist
    public int length(){
        if (head==null){
            return 0;
        }
      int  count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    //to insert node at the beginning of singly linked list
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    // delete first node of singlyLinkedList
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        return temp;
    }
        // delete last node of singly linked list
        public ListNode deleteLast(){
            if(head==null || head.next==null) {
                return head;
            }
            ListNode current=head;
            ListNode previous=null;
            while(current.next!=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            return current;


        }


        public static void main(String[] args) {
            SinglyLinkedList sll=new SinglyLinkedList();
         //   sll.head=new ListNode(5);
         //   ListNode second=new ListNode(7);
         //   ListNode third=new ListNode(8);
         //   ListNode fourth=new ListNode(9);
         //   sll.head.next=second;
          //  second.next=third;
           // third.next=fourth;
          //  sll.display();
            System.out.println(sll.length());
           sll.insertFirst(9);
           sll.insertFirst(8);
           sll.insertFirst(5);
           sll.insertFirst(6);
           sll.display();
           sll.insertLast(8);
            sll.display();
            sll.deleteFirst();
           sll.display();
            sll.deleteLast();
            sll.display();

        }
}
