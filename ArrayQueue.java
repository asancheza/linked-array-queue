public class ArrayQueue implements Queue {
  private int[] data = new int[1000];
  private int firstIndex = 0;
  private int nextOpenIndex = 0;

  public void enqueue(int value) {
    data[nextOpenIndex] = value;
    nextOpenIndex = nextIndex(nextOpenIndex);
  }

  public int dequeue() {
    int value = getFront();
    firstIndex = nextIndex(firstIndex);

    return value;
  }

  public int getFront() {
    int value = data[firstIndex];

    return value;
  }

  public boolean isEmpty() {
    return nextOpenIndex == firstIndex;
  }

  public void clear() {
    throw new UnsupportedOperationException();
  }

  public void splice(Queue q) {
    while (!q.isEmpty()) {
      enqueue(q.dequeue());
    }
  }

  private int nextIndex(int i) {
    return (i + 1) % data.length;
  }
}
