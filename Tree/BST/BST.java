public class BST<E extends Comparable<E>>
{
  private Node root;
  public BST()
  {
    root = null;
  }
  public void insert(E e)
  {
    insertPrivate(root, e);
  }
  private Node insertPrivate(Node n, E e)
  {
    if(n==null)
    {
        n=new Node();
        n.data=e;
        return n;
    }
    if(n.data.compareTo(e)>0)
    {
      if(n.left!=null)
      {
        insertPrivate(n.left, e);
      }
      else
      {
        n.left=insertPrivate(n.left,e);
      }
    }
    else
    {
      if(n.right!=null)
      {
        insertPrivate(n.right,e);
      }
      else
      {
        n.right=insertPrivate(n.right,e);
      }
    }
    return n;
  }
  public void postOrder()
  {
    printPostOrder(root);
  }
  private void printPostOrder(Node n)
  {
    if(n.left!=null)
    {
      printPostOrder(n.left);
    }
    System.out.println(n.data);
    if(n.right!=null)
    {
      printPostOrder(n.right);
    }
  }
  public static void main(String[] args)
  {
    BST<Integer> b = new BST<Integer>();
    b.insert(5);
    b.insert(1);
    b.insert(3);
    b.insert(7);
    b.insert(21);
    b.postOrder();
  }
}
class Node<E extends Comparable<E>>
{
  E data;
  Node left;
  Node right;
}
