class DLL {
  private class Node {

    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.print("null");
  }

  public void insertAtFirst(int val) {
    Node newNode = new Node(val);

    newNode.next = head;
    newNode.prev = null;

    if (head != null)
      head.prev = newNode;

    head = newNode;

    if (tail == null)
      tail = head;

    size++;
  }

  public void insertAtEnd(int val) {
    if (tail == null) {
      insertAtFirst(val);
      return;
    }

    Node newNode = new Node(val);
    newNode.next = null;
    tail.next = newNode;
    newNode.prev = tail;
    tail = tail.next;

    size++;
  }

  public void insertAtAny(int val, int index) {
    if (index == 0) {
      insertAtFirst(val);
      return;
    }
    if (index == size) {
      insertAtEnd(val);
      return;
    }

  }

  public void reverse() {
    Node temp = tail;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.prev;
    }

    System.out.print("null");
  }

}

public class DLLMain {
  public static void main(String[] args) {
    DLL a = new DLL();
    a.insertAtFirst(1);
    a.insertAtEnd(2);
    a.print();
    a.reverse();
  }
}
