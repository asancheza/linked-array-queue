public interface Queue {
  public void enqueue(int value);

  public int dequeue();
  public int getFront();
  
  public boolean isEmpty();
  public void clear();
}
