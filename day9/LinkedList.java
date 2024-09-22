// Linked list implementation in Java

class LinkedList {
  // Creating a node
  Node head;

  static class Node {
    int value;
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    // Assign value values
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(7);
    Node fifth = new Node(11);
    Node sixth = new Node(12);


    // Connect nodess
    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;

    // printing node-value
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
} 

