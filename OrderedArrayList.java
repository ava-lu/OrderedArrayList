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
  public boolean add(T e) {
    if (e==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    super.add(e);
    for (int i=this.size()-1; i>=0; i--) {
      if (this.get(i).compareTo(this.get(i-1))==-1) {
        super.set(i,this.get(i-1));
      }
    }
    return super.add(e);
  }
  public void add(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Cannot add nulls");
    }
    for (int i=0; i<this.size(); i++) {
      if (i==index) super.add(i, element);
    }
    for (int i=this.size()-1; i>=0; i--) {
      if (this.get(i).compareTo(this.get(i-1))==-1) {
        super.set(i,this.get(i-1));
      }
    }
  }

}
