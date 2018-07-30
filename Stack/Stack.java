/**
*@author Hunter Soliday <hsoliday1@gmail.com>
*@version 0.1
*<p>
* this is a generic stack
* it is simple, and hopefully
* easier to use than Java's
* built in stack
* note: this stack can resize
*<p>
*/
public class Stack<E>
{
  private Object[] data;
  private int top;
/**
* this is a generic constructor
*/
  public Stack()
  {
    data = new Object[32];
    top=-1;
  }
  /**
  *constructor that takes
  *in the size of the base stack
  * @param  
  */
  public Stack(int n)
  {
    data = new Object[n];
    top=0;
  }
  public void push(E e)
  {
    if(top==(data.length-1))
    {
      increaseSize(32);
    }
    data[++top]=e;
  }
  public E peek()
  {
    return (E)data[top];
  }
  public E pop()
  {
    return (E)data[top--];
  }
  public boolean isEmpty()
  {
    return size()<0;
  }
  public int size()
  {
    return top;
  }
  public void increaseSize(int n)
  {
    Object[] tmp = new Object[data.length+n];
    for(int i = 0;i<top-1;i++)
    {
      tmp[i]=data[i];
    }
    data = tmp;
  }
  public void shrink()
  {
    Object[] tmp = new Object[top -1];
     for(int i = 0;i<top-1;i++)
    {
      tmp[i]=data[i];
    }
    data = tmp;
  }
  public static void main(String[] args)
  {
    Stack<Integer> stack1 = new Stack<Integer>();
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
    stack1.push(4);
    stack1.push(5);
    stack1.push(6);
    System.out.println("1 2 3 4 5 6 reversed equals: ");
    while(!stack1.isEmpty())
    {
      System.out.print(stack1.pop()+" ");
    }
    System.out.println("");
    System.out.println("Stack.isEmpty()== "+stack1.isEmpty());
    System.out.println("Stack.size()== "+stack1.size());
    for(int i = 0;i<257;i++)
    {
      stack1.push(i);
    }
    for(int i = 0;i<257;i++)
    {
      stack1.pop();
    }
    System.out.println("resizing isn't broke");
  }
}
