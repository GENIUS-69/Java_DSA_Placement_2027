public class LL {
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

  public void insertFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;

    if (tail == null)
      head = tail;

    size += 1;
  }

  public void print() {
    Node temp = head;

    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }
  
}
