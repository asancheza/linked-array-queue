public class Tester {
  public static void main(String[] args) {
    Queue q = new ArrayQueue();

    for (int j = 0; j < 100; j++) {
      for (int i = 0; i < 100; i++) {
        q.enqueue(i);
      }

      for (int i = 0; i < 100; i++) {
        int val = q.dequeue();
        System.out.println(val);
        if (i != val) {
          System.out.println("Broken");
        }
      }
    }

    Queue q2 = new LinkedQueue();

    for (int j = 0; j < 100; j++) {
      for (int i = 0; i < 100; i++) {
        q2.enqueue(i);
      }

      for (int i = 0; i < 100; i++) {
        int val = q2.dequeue();
        System.out.println(val);
        if (i != val) {
          System.out.println("Broken");
        }
      }
    }
  }
}