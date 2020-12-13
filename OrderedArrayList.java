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
    for (int i=this.size()-1; i>=0; i--) {
      if (this.get(i).compareTo(this.get(i-1))==-1) {
        super.set(i,this.get(i-1));
      }
    }
    return super.set(index,value);
  }
}
