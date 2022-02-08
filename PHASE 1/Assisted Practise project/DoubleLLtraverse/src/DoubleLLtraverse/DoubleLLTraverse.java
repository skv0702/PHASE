package DoubleLLtraverse;

class Node {
    int data;
    Node next;
    Node prev;
};

class LinkedList {
  Node head;

  LinkedList(){
    head = null;
  }
  void push_back(int newElement) {
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null;
    newNode.prev = null; 
    if(head == null) {
      head = newNode;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
      newNode.prev = temp;
    }    
  }
  void PrintList() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }    
}; 
public class DoubleLLTraverse {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();

    MyList.push_back(10);
    MyList.push_back(20);
    MyList.push_back(30);

    MyList.PrintList(); 
  }
}