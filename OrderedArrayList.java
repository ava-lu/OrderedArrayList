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
     // if (index>=super.size() || index<0) {
     //   throw new IllegalArgumentException("Index not within bounds");
     // }
    T ans = super.set(index,value);
    super.add(this.findindex(value), value);
    return ans;
  }
  public boolean add(T e) {
    if (e==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    super.add(this.findindex(e), e);
    return super.add(e);
  }
  public void add(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    if (index>=super.size() || index<0) {
      throw new IllegalArgumentException("Index not within bounds");
    }
    super.add(this.findindex(element), element);
  }
  private int findindex(T element) {
    int ans=0;
    for (int i=0; i<super.size(); i++) {
      if (super.get(i).compareTo(element)==1) {
        ans = i;
      }
    }
    return ans;
   }

}
