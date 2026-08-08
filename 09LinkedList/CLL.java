public class CLL {
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

  public CLL() {
    this.head = null;
    this.tail = null;
  }

  public void insert(int val) {
    Node node = new Node(val);

    if (head == null) {
      head = node;
      tail = node;
      return;
    }

    tail.next = node;
    node.next = head;
    tail = node;
    size++;
  }

  public void print() {
    Node node = head;
    if (head != null) {
      do {
        System.out.print(node.value + " -> ");
        node = node.next;
      } while (node != head);
      System.out.print("HEAD");
    }
  }

  public static void main(String[] args) {
    CLL a = new CLL();
    a.insert(0);
    a.insert(1);
    a.insert(2);
    a.print();
  }
}
