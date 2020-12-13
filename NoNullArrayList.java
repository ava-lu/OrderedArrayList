import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public T set(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Cannot have nulls");
    }
    return super.set(index, element);
  }
  public boolean add(T e) {
    if (e==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    return super.add(e);
  }
  public void add(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    super.add(index, element);
  }
}
