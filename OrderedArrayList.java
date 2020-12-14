public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public T set(int index, T value) {
    if (value==null) {
      throw new IllegalArgumentException("Cannot set nulls");
    }
    T ans = super.get(index);
    super.remove(index);
    super.add(findindex(value), value);
    return ans;
  }
  public boolean add(T e) {
    if (e==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    add(findindex(e), e);
    return true;
  }
  public void add(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    super.add(findindex(element), element);
  }
  private int findindex(T element) {
    int ans=0;
    for (int i=0; i<super.size(); i++) {
      if (super.get(i).compareTo(element)==1) {
        ans = i;
        return ans;
      }
      else if (super.get(i).compareTo(element)==0) {
        ans = i;
        return ans;
      }
    }
    if (ans==0) ans=super.size();
    return ans;
   }

}
