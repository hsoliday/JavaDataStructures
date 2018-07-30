public class Test
{
  public static void main(String[] args)
  {
    LinkedList<Integer> list=new LinkedList();
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);
    list.add(65);
    list.add(75);
    print(list);
  }
  public static print(LinkedList<Integer> l)
  {
      for(Integer I :l.toArray())
      {
        System.out.print(I.toString);
      }
  }


}
