public class ArrayList<E>
{
  private E[] data;
  private boolean doubleMode;
  private int increaseSize;
  private int size;
  public ArrayList()
  {
    doublemode = true;
    data = new E[32];
    increaseSize=10;
    size = 0;
  }
  public ArrayList(int baseSize)
  {
    doublemode = true;
    data = new E[baseSize];
    increaseSize=10;
    size=0;
  }
  public boolean isEmpty()
  {
    if(size==0)
    {
      return true;
    }
    return false;
  }
  public void increaseSize()
  {
    if(doubleMode)
    {
      doubleIncrease();
    }
    else
    {
      setSizeIncrease();
    }
  }
  private void setSizeIncrease()
  {
    E[] tmp=new E[data.length+increase];
    for(int i = 0;i<data.length;i++)
    {
      tmp[i]=data[i];
    }
    data = tmp;
  }
  private void doubleIncrease()
  {
    E[] tmp=new E[data.length*2];
    for(int i = 0;i<data.length;i++)
    {
      tmp[i]=data[i];
    }
    data = tmp;
  }
  public setDoubleMode(double d)
  {
    doubleMode = d;
  }
  public setIncreaseSize(int i)
  {
    if(i>0)
    {
      increaseSize=i;
    }
  }
  public void addFront(E e)
  {
    add(e,0);
  }
  public void add(E e)
  {
    if(data.length==size)
    {
      increaseSize();
    }
    data[size]=e;
    size++;
  }
  public Object get(int n)
  {
    return data[n];
  }
  public void Remove(int n)
  {

  }
  public void add(E e, int n)
  public Object[] toArray()
  public String toString()
  public int size()
}
