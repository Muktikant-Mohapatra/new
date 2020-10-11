package linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
         LinkedList list=new LinkedList();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.remove(10);
         System.out.println(list.indexOf(30));
	}

}
