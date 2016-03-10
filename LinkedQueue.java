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
    if (this.isFull()) {
      Node node = new Node();
      node.value = value;
      node.next = first;
      last.next = node;
    } else if (isEmpty()) {
      first.value = value;
      last = first;
    } else {
      last = last.next;
      last.value = value;
    }
  }

  public int dequeue() {
    int value = getFront();

    if (first == last) {

    } else {

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
