class LL {
  private class Node {

    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public int length() {
    return size;
  }

  public void insertFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;

    if (tail == null)
      tail = head;

    size += 1;
  }

  public void print() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.value + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void insertAtAny(int val, int index) {
    if (index == 0) {
      insertFirst(val);
      return;
    }

    if (index == size) {
      insertAtEnd(val);
      return;
    }

    Node temp = head;

    for (int i = 1; i < index; i++)
      temp = temp.next;

    Node newNode = new Node(val, temp.next);
    temp.next = newNode;
    size++;
  }

  public void insertAtEnd(int val) {
    if (tail == null) {
      insertFirst(val);
      return;
    }

    Node newNode = new Node(val);
    tail.next = newNode;
    tail = newNode;
    size++;
  }

  public int deleteFirst() {
    int val = head.value;
    head = head.next;

    if (head == null)
      tail = null;

    size--;
    return val;
  }

  public int deleteEnd() {
    if (size <= 1) {
      return deleteFirst();
    }

    Node secondLast = get(size - 2);
    int val = tail.value;

    tail = secondLast;
    tail.next = null;
    size--;

    return val;
  }

  public int deleteAtAny(int index) {
    if (index == 0) {
      deleteFirst();
    }

    if (index == size - 1) {
      deleteEnd();
    }
    Node prev = get(index - 1);
    int val = prev.next.value;

    prev.next = prev.next.next;
    size--;
    return val;
  }
}

public class Main {
  public static void main(String[] args) {
    LL a = new LL();
    a.insertFirst(1);
    a.insertAtEnd(2);
    a.insertAtEnd(3);
    a.insertAtEnd(5);
    a.insertAtEnd(6);
    a.insertAtAny(4, 3);
    a.print();
    a.deleteFirst();
    a.deleteEnd();
    a.print();
  }
}
