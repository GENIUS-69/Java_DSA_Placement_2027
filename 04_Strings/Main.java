public class Main {
  public static void main(String[] args) {
    String name = "Sarthak";
    System.out.println(name);
    name = "Hota";
    System.out.println(name);

    /**
     * Here the reference variable created in stack memeory and the object created in heap memory. As per the string immutablity rule we can't change the object value of string.
     * But here, the value "Sarthak" created in a string pool inside the heap.
     * When we change the name value to "Hota", then it create another object in pool and reference variable point to second object and first object is handle by garbage collection.
     */
  }
}
