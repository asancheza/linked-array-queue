public class LinkedQueue implements Queue {
  private class Node {
    Node next;
    int value;
  }

  private Node first;
  private Node last;

  public LinkedQueue() {
    first = new Node();
    Node secondNode = new Node();
    first.next = secondNode;
    secondNode.next = first;
    
    last = null;
  }

  public void enqueue(int value) {
    Node temp = new Node();
    temp.value = value;
   
    if (isEmpty()) {
      temp.next = temp;
      first = temp;
      last = temp;
    } else {
      temp.next = first;
      last.next = temp;
      last = temp;
    }
  }

  public int dequeue() {
    if (isEmpty())
      throw new IllegalStateException();

    int value = getFront();

    if (first.next == first) {
      first = last = null;
    } else {
      first = first.next;
      last.next = first;
    }

    return value;
  }

  public boolean isEmpty() {
    return last == null;
  }

  public int getFront() {
    if (isEmpty())
      throw new IllegalStateException("Queue was empty");

    return first.value;
  }

  public void clear() {
    first = last = null;
  }

  public void splice(Queue q) {
    while (!q.isEmpty()) {
      enqueue(q.dequeue());
    }
  }

  private boolean isFull() {
    return !isEmpty() && last.next == first;
  }
}