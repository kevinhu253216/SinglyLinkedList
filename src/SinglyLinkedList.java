public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList(){
        head = null;
    }

    public void insertHead(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    Node insertNth(int value, int position){
        Node newNode = new Node(value);
        if(position == 0){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        while (--position > 0){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public Node deleteHead(){
        Node temp = head;
        head = head.next;
        return temp;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.getValue() + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        SinglyLinkedList myList = new SinglyLinkedList();
        System.out.println(myList.isEmpty());

        myList.insertHead(5);
        myList.insertHead(7);
        myList.insertHead(10);

        myList.display();
        System.out.println("1:-----------------------------");

        myList.deleteHead();
        myList.display();
        System.out.println("2:-----------------------------");

        myList.insertNth(5,2);
        myList.display();
        System.out.println("3:-----------------------------");
    }
    
}

class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}