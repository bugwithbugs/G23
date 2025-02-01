package Lecture17_Jan27_LinkedList_Questions;


public class CycleDetection {

   static boolean detectCycle(Node head){
    Node slow = head;
    Node fast = head;

    while (fast!=null && fast.next!=null) {
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            return true;
        }
    }
    return false;
   } 

   public static void main(String[] args) {

    LinkedList list = new LinkedList();
    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);
    list.insertAtEnd(50);
    
    list.display();

    //10->20->30->40->50->null
    Node head = list.getHead();

    System.out.println(detectCycle(head));


    //creating the cycle in linkedlist
    head.next.next.next.next = head.next;

    System.out.println(detectCycle(head));

   }
}
