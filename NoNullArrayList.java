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
}
