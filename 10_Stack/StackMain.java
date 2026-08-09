class CustomStack {
  protected int[] data;
  private static final int DEFAULT_SIZE = 5;
  int top = -1;

  public CustomStack() {
    this(DEFAULT_SIZE);
  }

  public CustomStack(int size) {
    this.data = new int[size];
  }

  public boolean push(int val) throws StackException {
    if (isFull()) {
      throw new StackException("Stack is Full!!");
    }

    top++;
    data[top] = val;
    return true;
  }

  private boolean isFull() {
    if (top == DEFAULT_SIZE - 1)
      return true;

    return false;
  }

  public int pop() throws StackException {
    if (isEmpty()) {
      throw new StackException("Stack is empty!!");
    }
    int val = data[top];
    top--;
    return val;
  }

  private boolean isEmpty() {
    if (top == -1)
      return true;

    return false;
  }

  public void display() {
    if (isEmpty())
      System.out.println("Stack is empty");

    for (int ele : data)
      System.out.print(ele + " ");

    System.out.println();
  }

  public int peek() {
    return (top == -1 ? -1 : data[top]);
  }

}

class StackException extends Exception {
  public StackException(String message) {
    super(message);
  }
}

public class StackMain {
  public static void main(String[] args) throws StackException {
    CustomStack s = new CustomStack();
    s.pop();
  }
}
