public class SinglyLinkedList<E>
{
  private Node head;
  prvate Node tail;
  private int size;
  public LinkedList()
  {
    head = null;
    tail = null;
    size = 0;
  }
  public boolean isEmpty()
  {
    if(head ==null)
    {
      return true;
    }
    return false;
  }
  public void addFront(E e)
  {
    if(isEmpty())
    {
      head = new Node(e);
      tail = head;
    }
    else
    {
      Node tmp=new Node(e);
      tmp.next=head;
      head=tmp;
    }
    size++;
  }
  public void add(E e)
  {
    if(isEmpty())
    {
      addFront(e);
    }
    else
    {
      Node tmp = new Node(e);
      tail.next = tmp;
      tail=tmp;
      size++;
    }
  }
  private Node getInternal(int n)
  {
    if(n>size||n<0)
    {
      return null;
    }
    if(n==0)
    {
      return head;
    }
    if(n==(size-1))
    {
      return tail;
    }
    Node tmp=head;
    for(int i=0;i<n;i++)
    {
      tmp=tmp.next;
    }
    return tmp;
  }
  public Object get(int n)
  {
    if(n>size)
    {
    return null;
    }
    else
    {
      return getInternal(n).data;
    }
  }
  public void Remove(int n)
  {
    Node tmp = getInternal(n-1);
    if(tmp==null||tmp.next==null)
    {
      return;
    }
    if(tmp.next.next==null)
    {
      tmp.next =null;
    }
    else
    {
      tmp.next=tmp.next.next;
    }
    size--;
  }
  public void add(E e, int n)
  {
    if(n>size-1)
    {
      add(e);
      return;
    }
    Node tmp = getInternal(n-1);
    Node tmp2=new Node(e);
    tmp2.next=tmp.next;
    tmp.next=tmp2;
    size++;


  }
  public Object[] toArray()
  {
    if(isEmpty())
    {
      return null;
    }
    Object[] arr = new Object[size];
    Node tmp = head;
    for(int i=0;i<size;i++)
    {
      arr[i]=tmp.data;
      tmp=tmp.next;
    }
    return arr;
  }
  public String toString()
  {
    String j ="";
    if(head==null)
    {
      return j;
    }
    Node tmp = head;
    while (tmp!=null)
    {
      j+=tmp.toString();
    }
    return j;
  }
  public int size()
  {
    return size;
  }

}
class Node<E>
{
  public E data;
  public Node next;
  public Node(E e)
  {
    data = e;
    next =null;
  }
  public Node()
  {
    data = null;
    next =null;
  }


}
