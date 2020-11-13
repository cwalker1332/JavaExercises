package DSAPractice;

public class Node {

    // this class includes exercises to practice using LinkedLists

    /*
    Write a method listLength(ControlPractice.Node list) that receives the head of a singly linked list
    and returns the number of nodes in the linked list.
    What is the worst-case runtime complexity of your algorithm?
     */

    static String data;
    static Node head;
    static Node next;
    static Node list = new Node(data);
    static Node current;

    // create ControlPractice.Node constructor
    public Node (String data) {
        this.data = data;
        this.next = null;
    }

    public static void append (String data){
        if(head == null){
            head = new Node(data);
        } else {

            current = head;

            while (current.next != null){
                current = current.next;
            }
            current.next = list;
        }
    }

    public static int listLength() {
        /*
        Pseudocode: 1) Initialize count as 0
        2) Initialize a node pointer, current = head.
        3) Do following while current is not NULL
            a) current = current -> next
            b) count++;
        4) Return count
        */

        // initialize count
        int nodeCount = 0;

        // initialize head
            current = head;

            while (current != null) {
                nodeCount++;
                current = current.next;
            }
        return nodeCount;
    }

    /*
    Write a method called searchLinkedList(ControlPractice.Node head, Object target) that receives the head of a linked list
    and target search value, and returns true if the target is in the list, or false if the target is not in the list.
    What is the worst-case runtime complexity of your algorithm?
     */

    public static void searchLinkedList (Node head, Object target){
        //boolean isPresent = true;
        //return isPresent;
    }

    public static void main(String[] args) {
        // create list and use listLength method to return its length
        list.append("Apple");
        list.append("Orange");
        list.append("Banana");
        list.append("Carrot");
        list.append("Beet");

        // call method
        //TODO: fix! should return 5, but only getting 0. Says everything is null so think issue is above
        System.out.println(listLength());

        // call searchLinkedList method
        // searchLinkedList(list, "Pear");
    //searchLinkedList(list, "Apple");
    }
}
