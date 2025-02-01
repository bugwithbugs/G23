package Lecture17_Jan27_LinkedList_Questions;

public class MergeSortedLists {
    
    static Node mergeSortedLists(Node head1, Node head2){

        Node dummy = new Node(-101);
        Node tail = dummy;
        while (head1 != null && head2 != null) {
            
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if(head1 != null)
            tail.next = head1;
        else tail.next = head2;

        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insertAtEnd(3);
        list1.insertAtEnd(5);
        list1.insertAtEnd(9);
        list1.insertAtEnd(13);

        list2.insertAtEnd(2);
        list2.insertAtEnd(4);
        list2.insertAtEnd(10);

        list1.display();
        System.out.println();
        list2.display();
        System.out.println();

        Node mergedListHead = mergeSortedLists(list1.getHead(), list2.getHead());

        while (mergedListHead != null) {
            System.out.print(mergedListHead.data + " ");
            mergedListHead = mergedListHead.next;
        }
    }
}
