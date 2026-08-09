class CustomQueue {
  protected int[] data;
  private static final int DEFAULT_SIZE = 5;
  int rear = -1, front = -1;

  public CustomQueue() {
    this(DEFAULT_SIZE);
  }

  public CustomQueue(int size) {
    this.data = new int[size];
  }

  public boolean enqueue(int val) {
    if (isFull()) {
      System.out.println("Queue is Full!!");
      return false;
    }
    if (rear == -1)
      rear++;

    front++;
    data[front] = val;
    return true;
  }

  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty!!");
      return -1;
    }

    if (rear == front)
      rear--;

    int val = data[front];
    front--;
    return val;
  }

  private boolean isFull() {
    if (front == DEFAULT_SIZE - 1)
      return true;

    return false;
  }

  private boolean isEmpty() {
    if (rear == -1 && front == -1)
      return true;

    return false;
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Stack is Empty!!");
      return;
    }
    for (int ele : data) {
      System.out.print(ele + " ");
    }
  }

  public int peek() {
    return (front == -1 ? -1 : data[front]);
  }
}

public class QuqueMain {
  public static void main(String[] args) {
    CustomQueue q = new CustomQueue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.display();
    q.enqueue(6);

  }
}
